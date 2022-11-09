# Proyecto UD2 Uxia y Nuria

INTRODUCCIÓN:

Nuestro programa permite realizar consultas a una pequeña base de datos de personajes y localizaciones del mundo de Studio Ghibli, así como guardar los resultados de las búsquedas en un fichero en formato json. Nuestra base de datos consta de dos tablas, una de personajes y otra de localizaciones.

![bdCharacters](https://user-images.githubusercontent.com/105040658/200899023-06c4885d-9486-4b02-9c42-02257fd87f28.PNG)

![bdLocations](https://user-images.githubusercontent.com/105040658/200899041-24b47e44-362d-4b0a-a87e-2bbb14415780.PNG)


MANUAL DE USO:

Al iniciar el programa veremos esta ventana donde podremos elegir sobre qué tabla hacer la consulta y qué consulta queremos hacer.

![main](https://user-images.githubusercontent.com/105040658/200899812-618a1ea1-f385-464b-be4b-6ac285fe387d.PNG)

Cuando pulsamos los botones se abrirán las correspondientes ventanas dependiendo de la tabla que esté marcada.

En la ventana de búsqueda de personajes podremos consultar los personajes registrados en la base de datos en función de su género, el cual podremos elegir en el desplegable de la parte superior. También podemos ver un botón que pone 'DELETE' al lado de cada personaje. Al pulsarlo borraremos a ese personaje de la base de datos.

![searchCharacter](https://user-images.githubusercontent.com/105040658/200900412-60a8f915-fe42-4101-9907-adebd6a8e832.PNG)

La ventana de búsqueda de localizaciones funciona de la misma manera que la de personajes, permitiendonos buscar una localización por el tipo de terreno que podemos elegir en el deplegable y borrarlas con sus respectivos botobes 'DELETE'.

![searchLocation](https://user-images.githubusercontent.com/105040658/200901215-d54aa39e-d159-40f7-bb8d-b940ca237bca.PNG)

En ambas ventanas nos encontraremos además con el botón 'Go Back', que nos llevará de vuelta a la ventana de inicio por si queremos hacer otra consulta, y en la parte inferior tenemos un cuadro de texto en el que podremos introducir un nombre para el fichero donde, al pulsar el botón 'Save', se guardarán los datos de la última búsqueda que hayamos hecho en formato .json .

En el caso de la ventana de añadir personajes nos encontraremos con los campos de texto que tendremos que rellenar para añadir al personaje. Cuando acabemos de introducir sus datos y pulsamos el botón 'INSERT' nos saldrá un mensaje conforme se ha añadido al nuevo personaje. Si no aparece el mensaje significa que alguno de los datos no es correcto y el personaje no se añadirá.

![addCharacter](https://user-images.githubusercontent.com/105040658/200902013-a5ae1cef-b2ba-4c19-aa91-72121e329751.PNG)

Y de la misma manera funciona la ventana de añadir localizaciones.

![addLocation](https://user-images.githubusercontent.com/105040658/200902160-adb66ef5-4f62-4ad1-8d57-c3f61b8d83d7.PNG)

Y en esta caso ambas ventanas cuentan también con el boton 'Go Back' que nos permitirá volver al inicio.


MANUAL DE DESARROLADOR:

LAUNCHER

La clase Launcher se usa para ejecutar la clase Main y poder generar un JAR sin problema

![1_Launcher](https://user-images.githubusercontent.com/105040658/200929682-28ff8c3c-d309-443a-99a1-6bbd6c179449.PNG)


MAIN
La clase Main es la que lanza la aplicación llamando a la vista choose.xml

![2_Main](https://user-images.githubusercontent.com/105040658/200930390-6c9339bc-f424-4ccb-9b08-9b58ddb25b1b.PNG)


CONTROLLER

La clase Controller se usa para que todas las otras clases controller extiendan de ella y se pueda usar la misma Stage en todas las ventanas pero con distintos Scene.

![3_ControllerSetScene](https://user-images.githubusercontent.com/105040658/200930424-4b224a65-1280-466b-97f6-adadc94304ef.PNG)

También contiene el enlace con la base de datos que usarán todos los demás controladores.

![3_ControllerURL](https://user-images.githubusercontent.com/105040658/200930606-0a8fcf52-3e56-4f8f-8476-4939065fb79e.PNG)


CHOOSE

En esta clase gestionamos el menú principal.

Lanza las ventanas de búsqueda de personajes o localizaciones dependiendo de qué radio button esté seleccionado al pulsar el botón Search

![7_ChooseSelect](https://user-images.githubusercontent.com/105040658/200931143-227d41ba-1194-4879-abda-f3392364a7a8.PNG)

Lanza las ventanas de inserción de personajes o localizaciones dependiendo de qué radio button esté seleccionado al pulsar el botón Add New

![8_ChooseInsert](https://user-images.githubusercontent.com/105040658/200931330-57243422-066d-4394-8822-19f534d2b5a5.PNG)


PEOPLE

La clase People tendrá un constructor de personajes con todos sus atributos, así como getters de los mismos.

![5_People](https://user-images.githubusercontent.com/105040658/200932861-fcacfb6e-3f4c-4009-9788-2344ac34e235.PNG)


En la clase PeopleController gestionamos las búsquedas y borrados de personajes con la interfaz people.fxml

Asocia las atributos de los personajes con las columnas de la tabla.

![9_PeopleInitialize](https://user-images.githubusercontent.com/105040658/200933556-589752a1-919e-4382-a4e7-dde743ef5cb3.PNG)

Realiza select a la tabla characters de la base de datos, creando a cada personaje con su respectivo botón delete, que al pulsar ejecutará un delete de ese personaje.

![10_peopleSearch](https://user-images.githubusercontent.com/105040658/200934196-13f1e224-18fc-41e0-8aa7-71e1ddaa20ab.PNG)

Vuelve a la ventana choose

![11_peopleGoBack](https://user-images.githubusercontent.com/105040658/200934663-1432f7e4-9058-49a2-88e9-9e43d0b060d2.PNG)

Guarda el contenido de getResult() en un fichero .json

![12_peopleSave](https://user-images.githubusercontent.com/105040658/200934828-d261ae60-968e-4099-ae2a-76302ca39cbf.PNG)

Genera un String con el contenido de la tabla en formato json

![13_peopleToString](https://user-images.githubusercontent.com/105040658/200934958-98dcaeb5-9289-41c8-876c-c73bfcacddbc.PNG)


En la clase PeopleInsertController gestionamos las inserciones de personajes en la base de datos

Ejecuta un insert en la tabla characters de la base de datos con el contenido de los cuadros de texto de la interfaz.

![14_peopleInsert](https://user-images.githubusercontent.com/105040658/200935080-ae69dbf1-2ab4-4ba6-8187-1ddbe5f24116.PNG)


LOCATION

La clase Location tendrá un constructor de localizaciones con todos sus atributos, así como getters de los mismos.

![6_Locations](https://user-images.githubusercontent.com/105040658/200935563-0694dfaf-8991-441c-9e5a-9e061d2cc18f.PNG)


En la clase LocationController gestionamos las búsquedas y borrados de localizaciones con la interfaz locations.fxml

Asocia las atributos de las localizaciones con las columnas de la tabla.

![15_locInit](https://user-images.githubusercontent.com/105040658/200935740-392e0609-0eb5-4093-b5d6-5a1620199a29.PNG)

Realiza select a la tabla locations de la base de datos, creando a cada localización con su respectivo botón delete, que al pulsar ejecutará un delete de esa localización.

![16_loccSearch](https://user-images.githubusercontent.com/105040658/200935850-229a457b-00f2-45b0-aabc-5c66fe9d9991.PNG)

Vuelve a la ventana choose

![17_locGoBack](https://user-images.githubusercontent.com/105040658/200935875-2ded823d-6ced-4c60-b1e1-d85a816f6861.PNG)

Guarda el contenido de getResult() en un fichero .json

![locSave](https://user-images.githubusercontent.com/105040658/200935921-a874dab4-e724-4129-90b6-4bfe8e74d38c.PNG)

Genera un String con el contenido de la tabla en formato json

![18_locResult](https://user-images.githubusercontent.com/105040658/200935966-0ce7fadc-5d6a-4577-9aa3-f53e59bdd663.PNG)


En la clase LocationInsertController gestionamos las inserciones de localizaciones en la base de datos

Ejecuta un insert en la tabla locations de la base de datos con el contenido de los cuadros de texto de la interfaz.

![locInsert](https://user-images.githubusercontent.com/105040658/200936089-cb318e49-9c89-4317-90f9-d2a4a0cf6d4d.PNG)


REPARTO DE TAREAS:

Nuria:
Consultas a la tabla characters y navegación entre ventanas

Uxía:
Consultas a la tabla locations y diseño de las interfaces

Ambas:
Documentación


EXTRAS:

Hemos implementado el control de errores de manera que el programa sea lo más robusto posible y que funcione sin problemas.


MEJORAS:

Como posibles mejoras podríamos implementar un nuevo tipo de consulta para actualizar los datos de alguno de los personajes/localizaciones ya existentes.


OPINIÓN:

Nuria: Creo que este proyecto realmente nos ha ayudado a entender como realizar conexiones con las bases de datos. A pesar de tener menos tiempo que el anterior proyecto, el hecho de no partir de cero y tener la base ya hecha también nos ayudó a centrarnos más en esta parte.


Uxía: 


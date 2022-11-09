# Proyecto UD2 Uxia y Nuria

INTRODUCCIÓN:

Nuestro programa permite realizar consultas a una pequeña base de datos de personajes y localizaciones de Studio Ghibli, así como guardar los resultados de las búsquedas en un fichero. Nuestra base de datos consta de dos tablas, una de personajes y otra de localizaciones

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

LAUNCHER:

La clase Launcher se usa para ejecutar la clase Main y poder generar un JAR sin problema

![1_launcher](https://user-images.githubusercontent.com/105040856/195914482-1dc6a25f-b6d8-419b-99f6-66f7ea49f00e.PNG)

CONTROLLER

La clase Controller se usa para que todas las otras clases controller extiendan de ella y se puda usar la misma Stage en todas las ventanas pero con distintos Scene

![1 0](https://user-images.githubusercontent.com/105040856/195914358-bc647d75-4b69-47f1-9c62-b593969e253c.PNG)

MAIN

En la clase Main empezamos en programa llamando a la vista main.fxml
![2_main](https://user-images.githubusercontent.com/105040856/195914594-a5e70ceb-82aa-4000-bcd7-88fccbf2c6b6.PNG)

Cuando se hace clic en el botón People se carga una nueva pantalla que se usa para buscar personajes

![5_metodoSearchP](https://user-images.githubusercontent.com/105040856/195914700-c16229a0-379c-4c17-a155-8c1ef10d9d9c.PNG)


Cuando se hace clic en el botón Locations se carga una nueva pantalla que se usa para guardar ubicaciones de las peliculas

![6_metodoSearchL](https://user-images.githubusercontent.com/105040856/195914739-ad857406-6a51-411c-81c3-acad809cdca8.PNG)

LOCATIONS

Le indica a cada columna de la tabla de qué atributo de Locations tiene que obtener su valor una vez se añada un objeto a la tabla.

![10_internaliceLC_true](https://user-images.githubusercontent.com/105040856/195915014-8bc1c23c-7a30-4c4d-88aa-b22a95daf5d1.PNG)

Genera una url para hacer una consulta a la API y mete los resultados en una lista para añadirlos a la tabla.

![11_metodoSearchLC_true](https://user-images.githubusercontent.com/105040856/195915029-601f9e3f-1e3c-44fc-bc41-70846fb4df16.PNG)

Crea una nueva instancia del MainController, pasándole el controlador actual para que se pueda visualizar correctamente.

![12_metodoGoBackLC_true](https://user-images.githubusercontent.com/105040856/195915046-58a2e955-379a-4a1b-a559-027870699a01.PNG)

Crea y devuelve un String a partir del contenido de tableLocation, que será el resultado de la búsqueda

![13_metodogetResultsLC_true](https://user-images.githubusercontent.com/105040856/195915064-3a84c3cf-5990-4e92-aab9-2dc9420c3fa1.PNG)

Genera un fichero .json a partir del String que obtenga del método getResults()

![13_metodoSaVeLC_true](https://user-images.githubusercontent.com/105040856/195915085-ad996336-9766-42c3-8f5d-4caa19ff1a62.PNG)

PEOPLE:

Le indica a cada columna de la tabla de qué atributo de People tiene que obtener su valor una vez se añada un objeto a la tabla.

![10_internaliceLC](https://user-images.githubusercontent.com/105040856/195915281-3b2335ad-1110-4677-870c-267f40ce479d.PNG)


Genera una url para hacer una consulta a la API y mete los resultados en una lista para añadirlos a la tabla.

![11_metodoSearchLC](https://user-images.githubusercontent.com/105040856/195915305-97654b36-e9a2-4029-9b74-c40a70691897.PNG)


Crea una nueva instancia del MainController, pasándole el controlador actual para que se pueda visualizar correctamente.

![12_metodoGoBackLC](https://user-images.githubusercontent.com/105040856/195915328-2930c4c6-f65d-40c1-bb8c-43a6cd164ae3.PNG)


Crea y devuelve un String a partir del contenido de tablePeople, que será el resultado de la búsqueda

![13_metodogetResultsLC](https://user-images.githubusercontent.com/105040856/195915348-a0fc3f16-7075-48c5-9adf-9852ca75a514.PNG)


Genera un fichero .json a partir del String que obtenga del método getResults()

![13_metodoSaVeLC](https://user-images.githubusercontent.com/105040856/195915358-16b00627-2680-421b-8035-8efe8974a662.PNG)


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
Como posibles mejoras podríamos implementar una nueva consulta para actualizar los datos de alguno de los personajes/localizaciones ya existentes.

OPINIÓN:

Nuria: Creo que este proyecto realmente nos ha ayudado a entender como realizar conexiones con las bases de datos. A pesar de tener menos tiempo que el anterior proyecto, el hecho de no partir de cero y tener la base ya hecha también nos ayudó a centrarnos más en esta parte.


Uxía: En mi opinión el proyecto ha venido bien para aprender algo sobre el Jackson y en algunos puntos si que me he quedado con ellos, pero en otros sigo muy confundida. También estoy de acuerdo con mi compañera de que hubiera estado bien una explicación sobre que se podía hacer con el Jackson y como se usa, para asi poder evitar algunos de los errores que nos dieron y nos pillaron por sorpresa, perdiendo horas, al no saber como arreglarlos, de desarrollo del programa y de poder hacer también los extras.


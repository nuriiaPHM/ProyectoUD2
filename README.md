# proyectoud1-uxia-nuria

INTRODUCCIÓN:

Nuestro programa permite realizar consultas a la API de Studio Ghibli de personajes y localizaciones, así como guardar los resultados de las búsquedas en un fichero. La API de Studio Ghibli contiene información sobre su universo con diferentes categorías. Además de las que utilizamos nosotras tiene otras tres categorías de películas, especies y vehículos.

![PostmanFilms](https://user-images.githubusercontent.com/105040658/195904073-d81625d5-c73b-48e6-9453-4321dc06242c.PNG)
![PostmanLocations](https://user-images.githubusercontent.com/105040658/195904079-75c403e5-2700-4bce-b2db-8f311fa01fbc.PNG)
![PostmanPeople](https://user-images.githubusercontent.com/105040658/195904083-075c661b-33f2-4737-bc74-7a4a45e8a1ee.PNG)


MANUAL DE USO:

Al iniciar el programa veremos esta pantalla donde podremos elegir sobre qué categoría queremos hacer la búsqueda.

![Main](https://user-images.githubusercontent.com/105040658/195904339-9114cdcd-e794-4a1d-b3bb-7ddfbba5d8ee.PNG)

Cuando pulsamos los botones se abrirán las correspondientes ventanas de búsqueda.

En la ventana Characters podemos seleccionar un género y al pulsar el botón 'Search' nos mostrará todos los personajes de ese género en la tabla de abajo, así como su nombre, edad y color de pelo.

![CharactersVacia](https://user-images.githubusercontent.com/105040658/195904414-91f8f16f-e9a9-4711-87ae-e654d3d67fea.PNG)

![CharactersDatos](https://user-images.githubusercontent.com/105040658/195904419-e449b06e-1aad-4892-82bd-75d5c3f1072b.PNG)


La ventana Locations funciona del mismo modo que Characters, tendremos que seleccionarun tipo de terreno y al pulsar 'Search' nos mostrará en la tabla todas las localizaciones de ese tipo junto con el nombre de cada una, el tipo de clima y la superficie de agua que tienen.

![LocationVacia](https://user-images.githubusercontent.com/105040658/195904813-4b8bcb5b-d9b6-4558-ba7a-f06493b6fe16.PNG)

![LocationDatos](https://user-images.githubusercontent.com/105040658/195904824-c951c2eb-f03d-4163-b316-12f802538149.PNG)

En ambas ventanas nos encontraremos además con el botón 'Go Back', que nos llevará de vuelta a la ventana de inicio por si queremos hacer otra búsqueda en otra categoría, y en la parte inferior tenemos un cuadro de texto en el que podremos introducir un nombre para el fichero donde, al pulsar el botón 'Save', se guardarán los datos de la última búsqueda que hayamos hecho en formato .json .

MANUAL DE DESARROLADOR
Launcher
![1_launcher](https://user-images.githubusercontent.com/105040856/195914482-1dc6a25f-b6d8-419b-99f6-66f7ea49f00e.PNG)

CONTROLLER
![1 0](https://user-images.githubusercontent.com/105040856/195914358-bc647d75-4b69-47f1-9c62-b593969e253c.PNG)

MAIN

![2_main](https://user-images.githubusercontent.com/105040856/195914594-a5e70ceb-82aa-4000-bcd7-88fccbf2c6b6.PNG)

![3_mainview](https://user-images.githubusercontent.com/105040856/195914619-9ce7d80a-3525-48f6-9c4b-6c4ae1e8fdb5.PNG)

![4_atributtesMain](https://user-images.githubusercontent.com/105040856/195914663-086c48a2-5652-43b1-8572-cd72f57a0453.PNG)

![5_metodoSearchP](https://user-images.githubusercontent.com/105040856/195914700-c16229a0-379c-4c17-a155-8c1ef10d9d9c.PNG)

![6_metodoSearchL](https://user-images.githubusercontent.com/105040856/195914739-ad857406-6a51-411c-81c3-acad809cdca8.PNG)

LOCARIONS

![3_locview](https://user-images.githubusercontent.com/105040856/195915193-1def1296-edcc-43b2-b036-ee4e0a8e1779.PNG)

![7_atributtesL](https://user-images.githubusercontent.com/105040856/195914862-236bf780-5fd8-4573-811f-2215bac65d1d.PNG)

![7_atributtesLC_true](https://user-images.githubusercontent.com/105040856/195914892-148f7968-21e0-49c1-a17b-4a340b423f3c.PNG)

![10_internaliceLC_true](https://user-images.githubusercontent.com/105040856/195915014-8bc1c23c-7a30-4c4d-88aa-b22a95daf5d1.PNG)

![11_metodoSearchLC_true](https://user-images.githubusercontent.com/105040856/195915029-601f9e3f-1e3c-44fc-bc41-70846fb4df16.PNG)

![12_metodoGoBackLC_true](https://user-images.githubusercontent.com/105040856/195915046-58a2e955-379a-4a1b-a559-027870699a01.PNG)

![13_metodogetResultsLC_true](https://user-images.githubusercontent.com/105040856/195915064-3a84c3cf-5990-4e92-aab9-2dc9420c3fa1.PNG)

![13_metodoSaVeLC_true](https://user-images.githubusercontent.com/105040856/195915085-ad996336-9766-42c3-8f5d-4caa19ff1a62.PNG)

PEOPLE

![9_peopleview](https://user-images.githubusercontent.com/105040856/195915256-a847f878-8250-4fd5-8898-c84e5b6f9a1a.PNG)

![10_internaliceLC](https://user-images.githubusercontent.com/105040856/195915281-3b2335ad-1110-4677-870c-267f40ce479d.PNG)

![11_metodoSearchLC](https://user-images.githubusercontent.com/105040856/195915305-97654b36-e9a2-4029-9b74-c40a70691897.PNG)

![12_metodoGoBackLC](https://user-images.githubusercontent.com/105040856/195915328-2930c4c6-f65d-40c1-bb8c-43a6cd164ae3.PNG)

![13_metodogetResultsLC](https://user-images.githubusercontent.com/105040856/195915348-a0fc3f16-7075-48c5-9adf-9852ca75a514.PNG)

![13_metodoSaVeLC](https://user-images.githubusercontent.com/105040856/195915358-16b00627-2680-421b-8035-8efe8974a662.PNG)


REPARTO DE TAREAS:

Nuria:
Consultas a la API, diseño de las interfaces

Uxía:
Exportación de los datos, navegación entre ventanas

Ambas:
Documentación

EXTRAS:
He implementado el control de errores de manera que el programa sea lo más robusto posible y que funcione sin problemas. El único requisito es tener una conexión a internet para poder consultar la API.

MEJORAS:
Como posibles mejoras podríamos implementar alguna de las categorías que no hemos utilizado o añadir más filtros de búsqueda

OPINIÓN:

Nuria: Bajo mi punto de vista este proyecto ha sido interesante, pero creo que nos hubiese venido bien alguna explicación previa más para agilizar el trabajo, ya que en muchas ocasiones nos atascamos porque no sabíamos como funcionaban ciertas clases o metodos que debíamos implementar.


Uxía: En mi opinion el proyecto a venido bien para aprender algo sobre el Jackson y en algunos puntos si que me he quedado con ellos, pero en otros sigo muy confundida. También estoy de acuerdo con mi compañera de que hubiera estado bien una explicación sobre que se podía hacer con el Jackson y como se usa, para asi poder evitar algunos de los errores que nos dieron y nos pillaron por sorpresa, perdiendo horas, al no saber como arreglarlos, de desarrollo del programa y de poder hacer también los extras.


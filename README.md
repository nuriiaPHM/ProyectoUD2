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
Nuria:
Bajo mi punto de vista este proyecto ha sido interesante, pero creo que nos hubiese venido bien alguna explicación previa más para agilizar el trabajo, ya que en muchas ocasiones nos atascamos porque no sabíamos como funcionaban ciertas clases o metodos que debíamos implementar.


Uxía:


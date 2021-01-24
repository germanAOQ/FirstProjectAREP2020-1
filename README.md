# Introducción a Sistemas Complejos, Java, Maven and Git                  
Haciendo uso Java, Maven y Git se escribió un programa para cacular la media y la desviación estándar de una serie de números reales. Esta serie de numeros se almacena con la ayuda de una linked list, hecha a partir de una implementación personal.
## Comenzando
Para obtener una copia del proyecto en tu máquina local y puedas realizar tareas de desarrollo, pruebas o ejecuciones debes clonarlo utilizando el siguiente comando:
```
git clone https://github.com/germanAOQ/FirstProjectAREP2020-1
```
### Pre-requisitos
Para hacer uso del software es necesario tener instalado:
* Maven: Automatiza y estandariza el flujo de vida de la construcción de software.                 
    Siga las instrucciones en http://maven.apache.org/download.cgi#Installation
* Git: Administrador descentralizado de configuraciones.                     
    Siga las instrucciones en http://git-scm.com/book/en/v2/Getting-Started-Installing-Git
### Instalación
Una vez clonado el proyecto, en la carpeta donde hayamos hecho el procedimiento, abrimos la shell del sistema operativo en la que estemos y accedemos al directorio de este
```
cd FirstProjectAREP2020-1
```
Ejecutamos la fase **package**, la cual ejecutara las fases previas del ciclo de vida: **validate, compile y test** y empaquetará el código ya compilado en un formato que se le haya especificado en el archivo de configuración, POM.xml
```
mvn package
```
Como se dijo previamente, este comando también compilara el código, lo empaquetará en el formato especificado y, adicionalmente, dejará estos archivos en la carpeta **target**. Esto se hace necesario saberlo para ejecutar el aplicativo. Este comando ejecutará una prueba hecha en el Main del proyecto:
```
java -cp target/miprimera-app-1.0-SNAPSHOT.jar edu.escuelaing.arep.app.App
```
Se debe obtener como resultado:
```
Media: 550.6
Desviacion estandar: 572.03
```
## Ejecutando las pruebas
Para ejecutar las pruebas, un total de 4, se debe hacer uso de la fase test
```
mvn test
```
### Pruebas unitarias
Como se dijo anteriormente, se hicieron cuatro pruebas teniendo en cuenta los siguientes datos:

| Column 1 | Column 2 |
| ---------- | ---------- |
| 160   | 15.0   |
| 591   | 69.9   |
| 114   | 6.5   |
| 229   | 22.4   |
| 230   | 28.4   |
| 270   | 65.9   |
| 128   | 19.4   |
| 1657  | 198.7   |
| 624   | 38.8   |
| 1503  | 138.2   |

Los resultados obtenidos fueron los siguientes:

| Test | Columna |Descripción |Expected Value | Actual Value |
| ---------- | ---------- | ---------- | ---------- | ---------- |
|Prueba 1| Columna 1 | Cálculo de la media de los datos presentes | 550.6| 550.6|
|Prueba 2| Columna 1 | Cálculo de la desviación estándar de los datos presentes | 572.03| 572.03|
|Prueba 3| Columna 2 | Cálculo de la media de los datos presentes | 60.32| 60.32|
|Prueba 4| Columna 2 | Cálculo de la desviación estándar de los datos presentes | 62.26| 62.26|

## Construido con 
* [Maven](https://maven.apache.org/) - Manejador de dependencias
* [Git](https://github.com/) - Control de versionamiento

## Autores 
* [Germán Andrés Ospina Quintero](https://github.com/germanAOQ)

## Licencia 📄
Este proyecto esta licenciado por GNU General Public License v3.0

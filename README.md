# cartautomationpractice
This is a automation project of automationpractice.com cart functions

**Para lanzar este proyecto es necesario añadir el driver de Google Chrome ("chromedriver.exe") a la variable PATH del sistema.**

**Este proyecto se ha realizado con la útlima versión de Intellij IDEA Community Edition, por lo que es recomendable instalar
el plugin de Cucumber en el IDE para evitar posibles conflictos con los archivos ".feature"**

Para ver los resultados de las pruebas de una manera más clara, es recomendable abrir el archivo **"/target/reports/index.html"** generado en la
carpeta target una vez finalizada la prueba.

-- Lanzar en modo headless --

Para lanzar la prueba en modo headless se puede descomentar la "linea 39" del archivo CartSteps.java y añadir la variable 
options a la inicialización del ChromeDriver()

Maven+Dependencias+Validacion de Expresionnes+Ofuscacion 

Descripción del proyecto

Este proyecto implementa una estructura de datos tipo Pila (Stack) utilizando Java y Maven, junto con un validador de expresiones que verifica si los símbolos (), [] y {} están correctamente balanceados.
Además, el proyecto demuestra el uso de dependencias Maven y el proceso de ofuscación de código utilizando ProGuard, comparando el comportamiento del programa antes y después de la ofuscación.

Instrucciones de compilación y ejecución
Compilar el proyecto
Abre la consola (CMD).
Me ubique en la carpeta raíz del proyecto stackHandler, donde se encuentra el archivo pom.xml.
Ejecute el siguiente comando:
mvn clean package
Este comando:
Limpia compilaciones anteriores
Genera el archivo .jar
Copia las dependencias en la carpeta target/libs
Genera el .jar normal y el .jar ofuscado
Comando ejecutado
mvn clean package
Salida en consola

El proyecto se compila correctamente mostrando:
BUILD SUCCESS
Análisis de la ofuscación
¿Qué tanto se dificulta la lectura?
La lectura del código ofuscado se dificulta considerablemente. Los nombres originales de clases, métodos y variables son reemplazados por nombres genéricos o letras simples, lo que impide entender fácilmente la intención del código.

¿Se pierde claridad estructural?
No se pierde completamente la estructura del programa. Las estructuras de control como if, for y los retornos permanecen intactos, pero la intención del código es menos clara debido al cambio de nombres.
¿Sigue siendo posible entender la lógica?
Sí, aún es posible entender la lógica general del programa analizando el flujo del código. Sin embargo, requiere más tiempo y esfuerzo en comparación con el código original.
Conclusión
En conclusión, al comparar el código original con el código ofuscado (analizado mediante herramientas como JD-GUI), se confirma que la ofuscación no altera el comportamiento del programa.
Ambas versiones ejecutan las mismas operaciones, producen los mismos resultados y mantienen el mismo flujo lógico.
La ofuscación únicamente afecta la legibilidad del código, aumentando la dificultad de análisis, pero sin modificar su funcionalidad.

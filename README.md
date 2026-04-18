# Prueba Técnica – Desarrollador Junior

## Objetivo
Corregir y completar los métodos del servicio para que los tests unitarios funcionen correctamente.


---


## Requisitos

- Java JDK 17 (recomendado)
- Visual Studio Code o IntelliJ
- Maven


---


## IMPORTANTE (Configuración Java)

Este proyecto usa **Java 17**.

Verifica tu versión con:

```bash
java -version
javac -version
```


---


## DESCRIPCION DEL EJERCICIO:

Analizar por qué fallan los tests

Corregir el método calcularTotal

Corregir el método calcularTotalConDescuento


---


## TENGA EN CUENTA LAS SIGUIENTES REGLAS:

❌ No eliminar tests

✅ Aplicar validaciones

✅ Manejar errores correctamente (excepciones)

✅ Mantener código limpio

❌ No debe subir cambios a la rama main
    

---


🎯 CRITERIOS DE EVALUACIÓN

Tests pasan correctamente

Uso adecuado de validaciones

Manejo de errores

Código claro y ordenado


--- 


## PASOS PARA EJECUTAR

1. Clonar repositorio
   
   ```bash
     git clone <URL_DEL_REPO>
   ```
   

3. Crear rama de trabajo
   
    Ubicado en el proyecto clonado ejecute

    ```bash
     git checkout -b nombrecompleto_documentoidentidad
    ```
   
    Esa sera la rama en la que debe desarrollar y subir al repositorio comun

5. Abrir proyecto
   
    En Visual Studio Code:
   
    code .
   
    En IntelliJ:
   
    File → Open → seleccionar carpeta

7. Cargar dependencias
   
    En VS Code:
   
    Abrir pom.xml
   
    Click en Reload Maven Project

9. Ejecutar pruebas
    
    Ubicar archivo:
   
        CarritoServiceTest.java
   
    Ejecutar:
   
        Click en ▶ Run Test
   
    O desde terminal:
   
        mvn test
   
11. Luego de desarrollar, ejecute en la terminal

    ```bash
        git add .
    
        git commit -m "Descripción del cambio"
    
        git push origin nombrecompleto_documentoidentidad
    ```

   
--- 

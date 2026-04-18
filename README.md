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


## PASOS PARA EJECUTAR

1. Clonar repositorio
    git clone <URL_DEL_REPO>

2. Abrir proyecto
    En Visual Studio Code:
    code .
    En IntelliJ:
    File → Open → seleccionar carpeta

3. Cargar dependencias
    En VS Code:
    Abrir pom.xml
    Click en Reload Maven Project

4. Ejecutar pruebas
    Ubicar archivo:
        CarritoServiceTest.java
    Ejecutar:
        Click en ▶ Run Test
    O desde terminal:
        mvn test

--- 

🧠 EJERCICIO

Debe:

Analizar por qué fallan los tests
Corregir el método calcularTotal
Corregir el método calcularTotalConDescuento


📌 REGLAS

❌ No eliminar tests
✅ Aplicar validaciones
✅ Manejar errores correctamente (excepciones)
✅ Mantener código limpio

---

🎯 CRITERIOS DE EVALUACIÓN

Tests pasan correctamente
Uso adecuado de validaciones
Manejo de errores
Código claro y ordenado
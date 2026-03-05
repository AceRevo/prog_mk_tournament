<p align="center">
  <img src="https://i.imgur.com/dEnYb8s.gif" width="750" alt="Descripción del GIF">
</p>

## Mortal Kombat: Tournament Management System

Este proyecto es un sistema de gestión de luchadores diseñado para practicar los fundamentos de la **Programación Orientada a Objetos (POO)** en Java. El sistema permite administrar las inscripciones de guerreros para el torneo de Earthrealm, controlando cupos limitados y validando identidades únicas.

## 🎯 Objetivo Técnico
Aplicar de forma autónoma patrones de gestión de datos utilizando:
- **Composición de clases.**
- **Arrays unidimensionales de tamaño fijo** (sin el uso de ArrayList).
- **Encapsulamiento** (atributos privados y métodos públicos).
- **Documentación Javadoc.**
- **Algoritmos de búsqueda y filtrado de `null`.**

---

## 📖 Escenario: El Torneo de los Reinos
El Reino de la Tierra (*Earthrealm*) está organizando un torneo y necesita un sistema para gestionar a sus luchadores. Debido a las reglas de los Dioses Antiguos, el torneo tiene un límite estricto de **12 luchadores**.

### Atributos del Luchador
Cada `Luchador` en el sistema cuenta con:
- `id` (int): Identificador único.
- `nombre` (String): Nombre del guerrero.
- `reino` (String): Origen (Netherrealm, Outworld, etc.).
- `nivelPoder` (int): Valor numérico de su fuerza.

---

## 🧩 Estructura del Proyecto

### 1. Clase `Luchador`
Clase POJO que representa la entidad básica. Incluye:
- Atributos privados.
- Constructor completo con Javadoc.
- Métodos `getters` y `toString()`.

### 2. Clase `Torneo`
Clase controladora que gestiona el array de participantes.
- **Atributos:**
  - `private Luchador[] participantes;`
  - `private final int MAX_PARTICIPANTES;`
- **Métodos obligatorios:**
  - `buscarLuchador(int id)`: Localiza un guerrero por su ID.
  - `encontrarPlazaLibre()`: Gestiona el espacio físico en el array (devuelve primer índice `null`).
  - `inscribirLuchador(Luchador l)`: Valida que el ID no esté repetido y que haya espacio antes de insertar.
  - `listarParticipantes()`: Genera un reporte de todos los inscritos.
  - `totalInscritos()`: Conteo dinámico de objetos no nulos.

---

## 🖥️ Demostración de Uso (Main)
El sistema incluye una clase de prueba que ejecuta el siguiente flujo:
1. Instanciación del torneo con capacidad para 12 guerreros.
2. Inscripción de personajes icónicos (Sub-Zero, Scorpion, Liu Kang, etc.).
3. Validación de errores (intentar inscribir un ID duplicado).
4. Búsqueda de luchadores existentes y no existentes.
5. Listado final de la tabla de combatientes.

---

## 🔥 Retos de Ampliación (Implementados)
Para demostrar un dominio avanzado del array fijo, se han incluido:
- `expulsarLuchador(int id)`: Elimina a un guerrero y libera su plaza.
- `ordenarPorPoder()`: Algoritmo de ordenación de mayor a menor nivel de poder, desplazando los huecos libres al final.

---

## 📊 Criterios de Calidad
- [x] **Código Limpio:** Nombres de variables significativos y métodos cortos.
- [x] **Robustez:** Control de `NullPointerException` al recorrer el array.
- [x] **Documentación:** Javadoc completo en todas las firmas públicas.
- [x] **Persistencia Temporal:** Uso correcto de arrays estáticos.

---

> *"Your soul is mine!"* – Este proyecto asegura que los cimientos de tu programación sean tan sólidos como un Fatality de Shang Tsung.

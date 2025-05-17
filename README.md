# 🩺 EVA02 - Gestión de Órdenes de Venta con Spring Boot

Este proyecto fue desarrollado como parte del curso **Desarrollo de Aplicaciones Web**. Simula un sistema de gestión de órdenes de venta y sus respectivos detalles utilizando **Spring Boot**, aplicando buenas prácticas de inyección de dependencias, arquitectura por capas y pruebas de endpoints REST con **Postman**.

---

## 📌 Tecnologías utilizadas

- ✅ Java 17
- ✅ Spring Boot 3.x
- ✅ Spring Web
- ✅ Spring Data JPA
- ✅ H2 Database (en memoria)
- ✅ IntelliJ IDEA
- ✅ Postman (para pruebas HTTP)
- ✅ Maven

---

## 📂 Estructura del proyecto

```src/
```├─ main/ 
```│ ├─ java/
```│ │ └─ tecsup.edu.pe.eva02_heredia_daw/
```│ │ ├─ model/
```│ │ ├─ dao/
```│ │ ├─ service/
```│ │ └─ controller/
```│ └─ resources/
```│ ├─ application.properties
```│ └─ static/templates (opcional)
```
yaml
Copiar
Editar

---

## 🧠 Funcionalidad

El proyecto permite:

- Crear, listar, buscar y eliminar **órdenes de venta**
- Crear, listar, buscar y eliminar **detalles de cada orden**
- Probar todos los endpoints HTTP (`GET`, `POST`, `PUT`, `DELETE`)
- Simular relaciones entre entidades (`OneToMany`, `ManyToOne`)

---

## 🔧 ¿Cómo ejecutar el proyecto?

1. **Clona este repositorio:**
   ```bash
   git clone https://github.com/imbubb4/EVA02_HEREDIA_DAW.git
Importa el proyecto en IntelliJ IDEA como proyecto Maven

Verifica que tengas instalado:

JDK 17

Maven configurado

Ejecuta la aplicación:

Abre Eva02HerediaDawApplication.java

Haz clic derecho y selecciona Run

⚙️ Configuración de la base de datos
Este proyecto utiliza H2 en memoria, por lo que no necesitas instalar MySQL.
Está configurado automáticamente en el archivo application.properties:

```properties
```Copiar
```Editar
```spring.datasource.url=jdbc:h2:mem:ventas_db
```spring.datasource.driver-class-name=org.h2.Driver
```spring.datasource.username=sa
```spring.datasource.password=
```spring.jpa.hibernate.ddl-auto=update
```spring.jpa.show-sql=true
```spring.h2.console.enabled=true
```spring.h2.console.path=/h2-console
```
Puedes acceder a la consola H2 desde:
🔗 http://localhost:8080/h2-console

📥 Ejemplo de JSON para pruebas
```
```Crear Orden:
```json
```Copiar
```Editar
```{
```  "nroOrdenVta": 10,
```  "fechaEmision": "2024-05-20",
```  "motivo": "Pedido por campaña de invierno",
```  "situacion": "Pendiente"
```}
```Crear Detalle:
```json
```Copiar
```Editar
```{
```  "descripcionMed": "Vitamina C 1000mg",
```  "cantidadRequerida": 50,
```  "ordenVenta": {
```    "nroOrdenVta": 10
```  }
```}
```Actualizar Orden (PUT):
```json
```Copiar
```Editar
```{
```  "nroOrdenVta": 10,
```  "fechaEmision": "2024-05-20",
```  "motivo": "Pedido ajustado por emergencia",
```  "situacion": "Entregada"
```}
```Actualizar Detalle (PUT):
```json
```Copiar
```Editar
```{
```  "id": 1,
```  "descripcionMed": "Vitamina C 500mg sabor naranja",
```  "cantidadRequerida": 100,
```  "ordenVenta": {
```    "nroOrdenVta": 10
```  }
```}
```
✍️ Autor
👩‍💻 Adrián Heredia

💼 Estudiante de Diseño y Desarrollo de Software - 4to ciclo

📌 Nota
Este proyecto es educativo y no incluye autenticación ni persistencia permanente, ya que se ejecuta sobre una base de datos en memoria para facilitar pruebas de protocolos HTTP.

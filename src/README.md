# 🐶 Sistema de Gestión Clínica Veterinaria

Este sistema fue desarrollado  en Java, con el objetivo de gestionar mascotas, registrar consultas, y explorar servicios veterinarios, todo mediante una interfaz gráfica hecha con **Swing**.

## ✅ Proyecto

| Requisito                                                                 | Cumplido |
|---------------------------------------------------------------------------|----------|
| CRUD funcional en consola                                                 | ✅       |
| Prototipo funcional con Swing                                             | ✅       |
| Clases bien modeladas (Mascota, Consulta, Historial, etc.)               | ✅       |
| Controlador de lista con ArrayList (`CrudMascotas`)                      | ✅       |
| Todo en una estructura modular y sin patrón MVC                          | ✅       |
| Acciones CRUD implementadas en un solo `JInternalFrame`                  | ✅       |
| Navegación con `JMenuBar`, `JDesktopPane`, y múltiples ventanas internas | ✅       |
| Registro de consultas y visualización por mascota                        | ✅       |
| Visual con `JTree`, `JTable`, `JProgressBar`, `JOptionPane`, etc.        | ✅       |

---

## 🧩 Estructura del sistema

### 👨‍⚕️ Clases principales:
- `Mascota`: representa al paciente.
- `Consulta`: contiene código, fecha y veterinario.
- `Veterinario`: nombre y especialidad.
- `Historial`: contiene la lista de consultas.
- `Propietario`: (opcional en la GUI) muestra la relación con mascotas.
- `CrudMascotas`: controlador con ArrayList para gestionar las mascotas.

### 🪟 Interfaz gráfica (Swing):
- `VentanaPrincipal`: `JFrame` con menú principal.
- `FormularioPaciente`: registra mascotas.
- `ListaPacientes`: muestra pacientes en una `JTable`.
- `PanelRegistrarConsulta`: registra una nueva consulta médica.
- `PanelConsulta`: permite buscar mascotas y ver su historial + `JTree` de servicios.
- `PanelGestionMascotas`: permite buscar, editar y eliminar mascotas desde una misma ventana.

---

## ⚙️ Tecnologías usadas

- **Java 17+**
- **Swing**
- `ArrayList` para el almacenamiento interno
- `JDesktopPane`, `JInternalFrame`, `JTable`, `JTree`, `JOptionPane`, `JTextArea`, `JComboBox`, `JSpinner`

---

## 🚀 Cómo ejecutar

1. Abre el proyecto en **IntelliJ IDEA** o **NetBeans**.
2. Ejecuta el archivo `Main.java`.
3. Explora el sistema desde el menú:

    - `Archivo → Nuevo registro` → Registra una mascota.
    - `Vista → Gestión Mascotas` → Buscar, editar o eliminar mascotas.
    - `Vista → Registrar consulta` → Registra consultas médicas.
    - `Vista → Consulta` → Buscar mascota y ver historial.
    - `Vista → Pacientes` → Visualiza todas las mascotas.

---

## 🎯 Funcionalidades clave

- Búsqueda de mascotas por nombre.
- Edición y eliminación desde la tabla principal.
- Registro y visualización de consultas con fecha y veterinario.
- Vista tipo ficha clínica por mascota.
- Panel de servicios con `JTree`.
- Barra de carga animada al listar pacientes.

---

## ✍️ Autor

Desarrollado por: **Juan Guillermo Salazar**  
Proyecto académico para la materia de **Lenguaje de Programación**

---

## 🧼 Por mejorar (próximas versiones)
- Persistencia en archivo `.txt` o `.dat`
- Mejoras visuales (estilos, íconos, temas)
- Validaciones visuales más avanzadas

---
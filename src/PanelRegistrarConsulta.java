import javax.swing.*;
import java.awt.*;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class PanelRegistrarConsulta extends JInternalFrame {

    private CrudMascotas crudMascotas;

    public PanelRegistrarConsulta(CrudMascotas crudMascotas) {
        super("Registrar Consulta", true, true, true, true);
        this.crudMascotas = crudMascotas;

        setSize(450, 350);
        setLayout(new GridLayout(8, 2, 5, 5));

        JLabel lblNombreMascota = new JLabel("Nombre de la mascota:");
        JTextField txtNombreMascota = new JTextField();

        JLabel lblFecha = new JLabel("Fecha (YYYY-MM-DD):");
        JTextField txtFecha = new JTextField();

        JLabel lblVeterinario = new JLabel("Nombre del veterinario:");
        JTextField txtVeterinario = new JTextField();

        JLabel lblEspecialidad = new JLabel("Especialidad:");
        JTextField txtEspecialidad = new JTextField();

        JButton btnRegistrar = new JButton("Registrar Consulta");

        btnRegistrar.addActionListener(_ -> {
            String nombreMascota = txtNombreMascota.getText().trim();
            String fechaTexto = txtFecha.getText().trim();
            String nombreVet = txtVeterinario.getText().trim();
            String especialidad = txtEspecialidad.getText().trim();

            if (nombreMascota.isEmpty() || fechaTexto.isEmpty() || nombreVet.isEmpty() || especialidad.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios.");
                return;
            }

            Mascota mascota = crudMascotas.buscarPorNombre(nombreMascota);
            if (mascota == null) {
                JOptionPane.showMessageDialog(this, "❌ Mascota no encontrada.");
                return;
            }

            try {
                String codigo = IDGenerator.generarCodigoConsulta();
                Consulta consulta = new Consulta(codigo, fechaTexto, new Veterinario(nombreVet, especialidad));
                mascota.agregarConsulta(consulta);

                JOptionPane.showMessageDialog(this, "✅ Consulta registrada con éxito.");
                dispose(); // cerrar la ventana
            } catch (DateTimeParseException e) {
                JOptionPane.showMessageDialog(this, "Formato de fecha inválido. Usa YYYY-MM-DD");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
            }
        });

        add(lblNombreMascota);
        add(txtNombreMascota);
        add(lblFecha);
        add(txtFecha);
        add(lblVeterinario);
        add(txtVeterinario);
        add(lblEspecialidad);
        add(txtEspecialidad);
        add(new JLabel());
        add(btnRegistrar);
    }
}
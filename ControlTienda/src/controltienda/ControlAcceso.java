/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controltienda;

/**
 *
 * @author Johan
 */
class ControlAcceso {
    private boolean horarioAtencion;
    
    public ControlAcceso() {
        horarioAtencion = true;
    }
    
    public void setHorarioAtencion(boolean estado) {
        horarioAtencion = estado;
    }
    
    public boolean permitirAcceso(Cliente cliente) {
        return cliente.esEmpleado() || (cliente.tieneMembresia() && horarioAtencion);
    }
}
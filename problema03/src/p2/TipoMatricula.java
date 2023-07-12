/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2;

import p1.Matricula;
import p1.MatriculaCampamento;
import p1.MatriculaColegio;

import java.util.List;

public class TipoMatricula {
    private double promedioMatriculas;
    private List<Matricula> matriculas;

    public void establecerMatriculas(List<Matricula> m) {
        matriculas = m;
    }

    public List<Matricula> obtenerMatriculas() {
        return matriculas;
    }

    public void establecerPromedioTarifas() {
        double sumaTarifas = 0;
        for (Matricula matricula : matriculas) {
            matricula.establecerTarifa();
            sumaTarifas += matricula.obtenerTarifa();
        }
        promedioMatriculas = sumaTarifas / matriculas.size();
    }

    public double obtenerPromedioTarifas() {
        return promedioMatriculas;
    }
}
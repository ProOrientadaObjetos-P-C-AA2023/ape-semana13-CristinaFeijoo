/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p3;

import p1.*;
import p2.TipoMatricula;

import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        TipoMatricula tipos = new TipoMatricula();

        List<Matricula> matriculas = new ArrayList<>();
        matriculas.add(new MatriculaCampamento());
        matriculas.add(new MatriculaColegio());
        matriculas.add(new MatriculaEscuela());
        matriculas.add(new MatriculaJardin());
        matriculas.add(new MatriculaMaternal());

        tipos.establecerMatriculas(matriculas);
        tipos.establecerPromedioTarifas();
        System.out.printf("%.2f\n", tipos.obtenerPromedioTarifas());
    }
}


package paquete006;

    public class Principal {
        public static void main(String[] args) {
            DatosLuz datosLuz = new DatosLuz();
            DatosPropiedades datosPropiedades = new DatosPropiedades();
            DatosTelefono datosTelefono = new DatosTelefono();
            DatosAgua datosAgua = new DatosAgua();

            double[][] informacionLuz = datosLuz.datosGeneral();
            double[][] informacionLuzLoja = datosLuz.datosLoja();
            double[][] informacionPropiedades = datosPropiedades.datos();
            double[][] informacionTelefono = datosTelefono.datos();
            double[][] informacionAguaComercial = datosAgua.datosComerciales();
            double[][] informacionAguaCasas = datosAgua.datosCasas();

            double totalPagos = calcularTotalPagos(informacionLuz) + calcularTotalPagos(informacionLuzLoja)
                    + calcularTotalPagos(informacionPropiedades) + calcularTotalPagos(informacionTelefono)
                    + calcularTotalPagos(informacionAguaComercial) + calcularTotalPagos(informacionAguaCasas);

            System.out.println("Reporte General de la Billetera de Pagos");
            System.out.println("Información de la clase DatosLuz (General)");
            System.out.println("Cantidad de registros: " + informacionLuz.length);
            System.out.println("Total de pagos: $" + calcularTotalPagos(informacionLuz));
            System.out.println("Información de la clase DatosLuz (Loja)");
            System.out.println("Cantidad de registros: " + informacionLuzLoja.length);
            System.out.println("Total de pagos: $" + calcularTotalPagos(informacionLuzLoja));
            System.out.println("Información de la clase DatosPropiedades");
            System.out.println("Cantidad de registros: " + informacionPropiedades.length);
            System.out.println("Total de pagos: $" + calcularTotalPagos(informacionPropiedades));
            System.out.println("Información de la clase DatosTelefono");
            System.out.println("Cantidad de registros: " + informacionTelefono.length);
            System.out.println("Total de pagos: $" + calcularTotalPagos(informacionTelefono));
            System.out.println("Información de la clase DatosAgua (Comercial)");
            System.out.println("Cantidad de registros: " + informacionAguaComercial.length);
            System.out.println("Total de pagos: $" + calcularTotalPagos(informacionAguaComercial));
            System.out.println("Información de la clase DatosAgua (Casas)");
            System.out.println("Cantidad de registros: " + informacionAguaCasas.length);
            System.out.println("Total de pagos: $" + calcularTotalPagos(informacionAguaCasas));
            System.out.println("Total general de pagos: $" + totalPagos);
        }

        public static double calcularTotalPagos(double[][] informacion) {
            double totalPagos = 0.0;
            for (int i = 0; i < informacion.length; i++) {
                double costoUnitario = informacion[i][0];
                double cantidad = informacion[i][1];
                double cargoAdicional = informacion[i][2];
                double pago = costoUnitario * cantidad + cargoAdicional;
                totalPagos += pago;
            }
            return totalPagos;
        }
    }


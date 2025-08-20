public class actividad1 {

    public static void main(String[] args) {

        // 1) Datos del viaje
        double d1 = 42.0;
        double d2 = 58.5;
        double d3 = 37.2;

        double t1 = 0.9;
        double t2 = 1.4;
        double t3 = 0.8;

        double l1 = 5.1;
        double l2 = 6.9;
        double l3 = 4.3;

        double precioLitro = 1.35;
        double masaCargaKg = 1200.0;
        double largo = 2.0;
        double ancho = 1.2;
        double alto = 1.1;

        double p1 = 2.5;
        double p2 = 3.0;
        double p3 = 2.0;
        double deprecPorKm = 0.08;

        double volCamionM3 = 10.0;
        double fCO2 = 2.68;
        double galPorLitro = 0.264172;
        int vMin = 30;
        int vMax = 90;

        int va = 40;
        int vb = 80;
        double ca = 0.05;
        double cb = 0.09;
        double a = -0.0008;
        double b = 0.08;
        double c = 4.0;

        double v1 = d1 / t1;
        double v2 = d2 / t2;
        double v3 = d3 / t3;

        double vprom = (d1 * v1 + d2 * v2 + d3 * v3) / (d1 + d2 + d3);

        double kml1 = d1 / l1;
        double kml2 = d2 / l2;
        double kml3 = d3 / l3;
        double kmltotal = (d1 + d2 + d3) / (l1 + l2 + l3);

        double costoComb = (l1 + l2 + l3) * precioLitro;
        double deprec = (d1 + d2 + d3) * deprecPorKm;
        double peajes = p1 + p2 + p3;
        double costoDirecto = costoComb + deprec + peajes;
        double costoPorKm = costoDirecto / (d1 + d2 + d3);

        double volumenM3 = largo * ancho * alto;
        double densidad = masaCargaKg / volumenM3;
        double ocupacion = volumenM3 / volCamionM3;

        double CO2Total = (l1 + l2 + l3) * fCO2;
        double CO2PorKm = CO2Total / (d1 + d2 + d3);

        double msVprom = vprom * (1000 / 3600.0);
        double galTot = (l1 + l2 + l3) * galPorLitro;
        double vnorm = (vprom - vMin) / (vMax - vMin);

        double vmedia = (v1 + v2 + v3) / 3;
        double sigma = Math.sqrt(
            ((v1 - vmedia) * (v1 - vmedia) +
             (v2 - vmedia) * (v2 - vmedia) +
             (v3 - vmedia) * (v3 - vmedia)) / 3
        );

        double vpondt = (t1 * v1 + t2 * v2 + t3 * v3) / (t1 + t2 + t3);

        double cvprom = ca + (cb - ca) * (vprom - va) / (vb - va);
        double costoMant = cvprom * (d1 + d2 + d3);

        double v = vprom;
        double kmlv = a * Math.pow(v, 2) + b * v + c;
        double kmlModelo = kmlv;
        double litrosModelo = (d1 + d2 + d3) / kmlModelo;

        double w1 = 0.25;
        double w2 = 0.25;
        double w3 = 0.25;
        double w4 = 0.25;

        double score = w1 * (1 / costoPorKm) +
                       w2 * kmltotal +
                       w3 * (1 / CO2PorKm) +
                       w4 * (1 / (1 + sigma));

        // Imprimir variables
        System.out.println("v1 = " + v1);
        System.out.println("v2 = " + v2);
        System.out.println("v3 = " + v3);
        System.out.println("vprom = " + vprom);
        System.out.println("kml1 = " + kml1);
        System.out.println("kml2 = " + kml2);
        System.out.println("kml3 = " + kml3);
        System.out.println("kmltotal = " + kmltotal);
        System.out.println("costoComb = " + costoComb);
        System.out.println("deprec = " + deprec);
        System.out.println("peajes = " + peajes);
        System.out.println("costoDirecto = " + costoDirecto);
        System.out.println("costoPorKm = " + costoPorKm);
        System.out.println("volumenM3 = " + volumenM3);
        System.out.println("densidad = " + densidad);
        System.out.println("ocupacion = " + ocupacion);
        System.out.println("CO2Total = " + CO2Total);
        System.out.println("CO2PorKm = " + CO2PorKm);
        System.out.println("msVprom = " + msVprom);
        System.out.println("galTot = " + galTot);
        System.out.println("vnorm = " + vnorm);
        System.out.println("vmedia = " + vmedia);
        System.out.println("sigma = " + sigma);
        System.out.println("vpondt = " + vpondt);
        System.out.println("cvprom = " + cvprom);
        System.out.println("costoMant = " + costoMant);
        System.out.println("kmlModelo = " + kmlModelo);
        System.out.println("litrosModelo = " + litrosModelo);
        System.out.println("score = " + score);
    }
}
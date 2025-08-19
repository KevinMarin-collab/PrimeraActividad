class segundopunto {
    public static void main(String [] args) {

        /* Punto 1 */
        double d1, d2, d3, t1, t2, t3, l1, l2, l3; 
        d1 = 35.0;
        d2 = 72.0; 
        d3 = 53.0;
        t1 = 0.7;
        t2 = 1.6; 
        t3 = 1.1;
        l1 = 4.4;
        l2 = 9.0;
        l3 = 6.2;
        double precioLitro = 1.42; 
        double masaCargaKg = 1450;
        double largo = 2.2; 
        double ancho = 1.3; 
        double alto = 1.0;
        double p1 = 3.2; 
        double p2 = 3.8;
        double p3 = 2.7; 
        double deprecPorKm = 0.085; 
        double volCamionM3 = 12.0;
        double fCO2 = 2.64; 
        double galPorLitro = 0.264172; 
        int vmin = 30; 
        int vmax = 90;
        int va = 40;
        int vb = 80; 
        double ca = 0.05; 
        double cb = 0.09; 
        double a = -0.0009;
        double b = 0.09;
        double c = 3.8;

        /* Punto 2 */
        double v1 = d1 / t1;
        double v2 = d2 / t2;
        double v3 = d3 / t3;
        System.out.println("v1 = " + v1);
        System.out.println("v2 = " + v2);
        System.out.println("v3 = " + v3);

        double vprom = (d1*v1 + d2*v2 + d3*v3) / (d1 + d2 + d3);
        System.out.println("vprom = " + vprom);

        double kml1 = d1 / l1;
        System.out.println("kml1 = " + kml1); 

        double kml2 = d2 / l2;
        System.out.println("kml2 = " + kml2); 

        double kml3 = d3 / l3;
        System.out.println("kml3 = " + kml3); 

        double kmltotal = (d1 + d2 + d3) / (l1 + l2 + l3);
        System.out.println("kmltotal = " + kmltotal);

        /* Punto 3 */
        double costoComb = (l1 + l2 + l3) * precioLitro;
        double deprec = (d1 + d2 + d3) * deprecPorKm;
        double peajes = p1 + p2 + p3;
        double costoDirecto = costoComb + deprec + peajes;
        double costoPorKm = (costoDirecto) / (d1 + d2 + d3);
        System.out.println("costoComb = " + costoComb);
        System.out.println("deprec = " + deprec);
        System.out.println("peajes = " + peajes);
        System.out.println("costoDirecto = " + costoDirecto);
        System.out.println("costoPorKm = " + costoPorKm);

        /* Punto 4 */
        double volumenM3 = largo * ancho * alto;
        double densidad = (masaCargaKg) / (volumenM3);
        double ocupacion = (volumenM3) / (volCamionM3);
        System.out.println("volumenM3 = " + volumenM3);
        System.out.println("densidad = " + densidad);
        System.out.println("ocupacion = " + ocupacion);

        /* Punto 5 */
        double CO2total = (l1 + l2 + l3) * fCO2;
        double CO2PorKm = (CO2total) / (d1 + d2 + d3);
        System.out.println("CO2total = " + CO2total);
        System.out.println("CO2PorKm = " + CO2PorKm);

        /* Punto 6 */
        double vmsprom = vprom * (1000) / (3600);
        double galTot = (l1 + l2 + l3) * galPorLitro;
        double vnorm = (vprom - vmin) / (vmax - vmin);
        System.out.println("vmsprom = " + vmsprom);
        System.out.println("galTot = " + galTot);
        System.out.println("vnorm = " + vnorm);

        /* Punto 7 */
        double vmedia = (v1 + v2 + v3) / (3);
        double elevado1 = (v1 - vmedia) * (v1 - vmedia);
        double elevado2 = (v2 - vmedia) * (v2 - vmedia);
        double elevado3 = (v3 - vmedia) * ((v3 - vmedia));
        double sigma = Math.sqrt((elevado1 + elevado2 + elevado3) / (3));
        double vpond_t = (t1*v1 + t2*v2 + t3*v3) / (t1 + t2 + t3);
        System.out.println("vmedia = " + vmedia); 
        System.out.println("sigma = " + sigma);
        System.out.println("vpond_t = " + vpond_t);

        /* Punto 8 */
        double cvprom = ca + (cb + ca) * (vprom - va) / (vb - va);
        double costoMant = cvprom * (d1 + d2 + d3);
        System.out.println("cvprom = " + cvprom);
        System.out.println("costoMant = " + costoMant);

        /* Punto 9 */
        double v = vprom;
        double kmlv = a * Math.pow(v, 2) + b * v + c;
        double kmlModelo = kmlv;
        double litrosModelo = (d1 + d2 + d3) / (kmlModelo);
        System.out.println("kmlModelo = " + kmlModelo);
        System.out.println("litrosModelo = " + litrosModelo);

        /* Punto 10 */
        double w1, w2, w3, w4;
        w1 = 0.25;
        w2 = 0.25;
        w3 = 0.25;
        w4 = 0.25;
        double score = w1 * ((1) / (costoPorKm)) + w2 * kmltotal + w3 * ((1) / (CO2PorKm)) + w4 * ((1) / (1 + sigma));
        System.out.println("score = " + score);
    }
}

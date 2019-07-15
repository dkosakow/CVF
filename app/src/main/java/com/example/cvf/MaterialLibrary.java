package com.example.cvf;

import java.util.ArrayList;
import java.util.Arrays;
/**
 * The MaterialLibrary hosts the data for all the default materials and instantiates an ArrayList of materials to use
 *
 * @author David Kosakowski, dkosakow@purdue.edu
 * @version 06/14/2019
 */
class MaterialLibrary {
    //<editor-fold desc="Default Materials & Properties">
                                    //E1    v12     a1      density
    private static double[][] epoxy = {{3500, 0.33, 0.55e-6, 1.54}};
    private static double[][] classAPVE = {{2750, 0.33, 80e-6, 1.17}};
    private static double[][] vinylEster = {{3600, 0.33, 80e-6, 1.166}};
    private static double[][] polyester = {{2500, 0.33, 124e-6, 1.37}};
    private static double[][] pps = {{5000, 0.33, 60e-6, 1.44}};
    private static double[][] abs = {{2500, 0.33, 80e-6, 1.07}};
    private static double[][] pet = {{2900, 0.33, 70e-6, 1.38}};
    private static double[][] nylon = {{2500, 0.33, 110e-6, 1.15}};
    private static double[][] peek = {{4000, 0.37, 55e-6, 1.32}};
    private static double[][] eGlass = {{72e3, 0.2, 5e-6, 2.55}};
    private static double[][] sGlass = {{86e3, 0.22, 5.5e-6, 2.55}};
    private static double[][] basalt = {{86e3, 0.25, 2.5e-6, 2.67}};
                                //E1    E2      v12     v23     G12     a1      a2      density
    private static double[][] carbon = {{257e3, 12450, 0.291, 0.206, 25e3, 2e-6, 5e-6, 1.8}};
    private static double[][] a42 = {{240e3, 12450, 0.291, 0.206, 25e3, 2e-6, 5e-6, 1.78}};
    private static double[][] grafil70034 = {{234e3, 12450, 0.291, 0.206, 25e3, 2e-6, 5e-6, 1.8}};
    private static double[][] kevlar = {{154e3, 4200, 0.35, 0.3, 2900, -4e-6, -4e-6, 1.47}};    //www.mse.mtu.edu/~drjohn/my4150/props.html

    private static Material Epoxy = new Material(epoxy, Material.SymmetryType.ISOTROPIC, Material.FiberType.MATRIX, "Epoxy");
    private static Material ClassAPVE = new Material(classAPVE, Material.SymmetryType.ISOTROPIC, Material.FiberType.MATRIX, "Class A PVE");
    private static Material VinylEster = new Material(vinylEster, Material.SymmetryType.ISOTROPIC, Material.FiberType.MATRIX, "Vinyl Ester");
    private static Material Polyester = new Material(polyester, Material.SymmetryType.ISOTROPIC, Material.FiberType.MATRIX, "Polyester");
    private static Material PPS = new Material(pps, Material.SymmetryType.ISOTROPIC, Material.FiberType.MATRIX, "PPS");
    private static Material ABS = new Material(abs, Material.SymmetryType.ISOTROPIC, Material.FiberType.MATRIX, "ABS");
    private static Material PET = new Material(pet, Material.SymmetryType.ISOTROPIC, Material.FiberType.MATRIX, "PET");
    private static Material Nylon = new Material(nylon, Material.SymmetryType.ISOTROPIC, Material.FiberType.MATRIX, "Nylon");
    private static Material Peek = new Material(peek, Material.SymmetryType.ISOTROPIC, Material.FiberType.MATRIX, "Peek");
    private static Material EGlass = new Material(eGlass, Material.SymmetryType.ISOTROPIC, Material.FiberType.FIBER, "E-Glass");
    private static Material SGlass = new Material(sGlass, Material.SymmetryType.ISOTROPIC, Material.FiberType.FIBER, "S-Glass");
    private static Material Basalt = new Material(basalt, Material.SymmetryType.ISOTROPIC, Material.FiberType.FIBER, "Basalt");
    private static Material Carbon = new Material(carbon, Material.SymmetryType.TRANSVERSE, Material.FiberType.FIBER, "Carbon");  //IM7 from Mike's papers
    private static Material A42 = new Material(a42, Material.SymmetryType.TRANSVERSE, Material.FiberType.FIBER, "A42");
    private static Material Grafil70034 = new Material(grafil70034, Material.SymmetryType.TRANSVERSE, Material.FiberType.FIBER, "Grafil 700-34");
    private static Material Kevlar = new Material(kevlar, Material.SymmetryType.TRANSVERSE, Material.FiberType.FIBER, "Kevlar");
    //</editor-fold>

    public static ArrayList<Material> materials = new ArrayList<Material>() {{
        add(Epoxy); add(ClassAPVE); add(VinylEster); add(Polyester); add(PPS);
        add(ABS); add(PET); add(Nylon); add(Peek); add(EGlass); add(SGlass);
        add(Basalt); add(Carbon); add(A42); add(Grafil70034); add(Kevlar);
    }};
}   //MaterialLibrary.java

package org.lab.sopa.letras;

import org.junit.Test;
import static org.junit.Assert.*;

public class SopaLetrasTests {
	
  @Test
  public void contieneUnaMatrixDeLetras(){
    SopaDeLetras sopaDeLetras = new SopaDeLetras();
    char[][] matrizEsperada = {{'a', 'b', 'c', 'd', 'e', 'a'},
    		                   {'g', 'h', 'i', 'j', 'r', 'l'},
    		                   {'u', 'm', 'n', 'r', 'p', 'q'},
    		                   {'a', 's', 'e', 'u', 'v', 'w'},
    		                   {'x', 'i', 'z', 'a', 'b', 'c'},
    		                   {'t', 'f', 'u', 'e', 'g', 'o'}};
    assertArrayEquals(matrizEsperada, sopaDeLetras.getMatriz());
  }
  
  @Test
  public void puedeAgregarUnaNuevaMatrixDeLetras(){
	 SopaDeLetras sopaDeLetras = new SopaDeLetras();
	 char[][] nuevaMatriz = {{'a', 'b', 'c'},
			                 {'d', 'e', 'f'},
			                 {'g', 'h', 'i'}};
	 sopaDeLetras.setMatriz(nuevaMatriz);
	 assertArrayEquals(nuevaMatriz, sopaDeLetras.getMatriz());
  }
  
  @Test
  public void retornaIndiceInvertidoDeLaPalabraAgua(){
	SopaDeLetras sopaDeLetras = new SopaDeLetras();
	assertArrayEquals(new int[][]{{0,0}, {0,5}, {3,0}, {4,3}}, sopaDeLetras.posiblesSolucionesDe("agua"));
  }
  
  @Test
  public void retornaIndiceInvertidoDeLaPalabraTierra(){
	SopaDeLetras sopaDeLetras = new SopaDeLetras();
	assertArrayEquals(new int[][]{{5,0}}, sopaDeLetras.posiblesSolucionesDe("tierra"));
  }
  
  @Test
  public void retornaAguaUsandoOrientacionVertical(){
	SopaDeLetras sopaDeLetras = new SopaDeLetras();
	assertEquals("agua", sopaDeLetras.palabraEnMatriz(new int[]{0,0}, "agua".length(), 1, 0));
  }
  
  @Test
  public void retornaABCUsandoOrientacionHorizontal(){
	SopaDeLetras sopaDeLetras = new SopaDeLetras();
	assertEquals("abc", sopaDeLetras.palabraEnMatriz(new int[]{0,0}, "abc".length(), 0, 1));
  }
  
  @Test
  public void retornaAXTConOrientacionVerticalLongitudCuatro(){
	SopaDeLetras sopaDeLetras = new SopaDeLetras();
	assertEquals("axt", sopaDeLetras.palabraEnMatriz(new int[]{3,0}, 4, 1, 0));
  }
  
  @Test
  public void retornaEGOConOrientacionHorizontalLongitudCuatro(){
	SopaDeLetras sopaDeLetras = new SopaDeLetras();
	assertEquals("ego", sopaDeLetras.palabraEnMatriz(new int[]{5,3}, 4, 0, 1));
  }
  
  @Test
  public void retornaCBAConOrientacionHorizontalReversa(){
	SopaDeLetras sopaDeLetras = new SopaDeLetras();
	assertEquals("cba", sopaDeLetras.palabraEnMatriz(new int[]{0,2}, 3, 0, -1));
  }
  
  @Test
  public void retornaTierraConOrientacionDiagonal(){
	SopaDeLetras sopaDeLetras = new SopaDeLetras();
    assertEquals("tierra", sopaDeLetras.palabraEnMatriz(new int[]{5,0}, "tierra".length(), -1, 1));
  }
  
  @Test
  public void retornaBWConOrientacionDiagonalLongitudTres(){
	SopaDeLetras sopaDeLetras = new SopaDeLetras();
	assertEquals("bw", sopaDeLetras.palabraEnMatriz(new int[]{4,4}, 3, -1, 1));
  }
  
  @Test
  public void retornaBAConOrientacionHorizontalIzquiedaLongitudTres(){
	SopaDeLetras sopaDeLetras = new SopaDeLetras();
	assertEquals("ba", sopaDeLetras.palabraEnMatriz(new int[]{0,1}, 3, 0, -1));
  }
  
  @Test
  public void retornaGAConOrientacionVerticalArribaLongitudTres(){
	SopaDeLetras sopaDeLetras = new SopaDeLetras();
	assertEquals("ga", sopaDeLetras.palabraEnMatriz(new int[]{1,0}, 3, -1, 0));
  }
}

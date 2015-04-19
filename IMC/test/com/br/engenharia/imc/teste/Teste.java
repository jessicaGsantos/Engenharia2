/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.engenharia.imc.teste;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import com.br.engenharia.imc.*;

/**
 *
 * @author jessicagomesdossantos
 */
public class Teste {
    
    public Teste() {
    }
    @Test
    public void testaCalculo(){
        Ex2 a = new Ex2();
        assertEquals(a.Calculos(),(1,1),1);
    }
    
}
/*******************************************************************************
 * Copyright (c) 2006 Eclipse.org
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.gmf.internal.xpand.parser;

public class XpandParserprs implements lpg.lpgjavaruntime.ParseTable, XpandParsersym {

    public interface IsKeyword {
        public final static byte isKeyword[] = {0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0
        };
    };
    public final static byte isKeyword[] = IsKeyword.isKeyword;
    public final boolean isKeyword(int index) { return isKeyword[index] != 0; }

    public interface BaseCheck {
        public final static short baseCheck[] = {0,
            1,6,1,4,1,1,3,1,5,10,
            1,0,5,1,3,1,3,1,3,1,
            3,1,1,1,1,1,1,1,3,1,
            1,1,3,1,1,1,2,2,2,3,
            1,2,1,1,1,1,1,1,1,1,
            3,4,3,1,1,3,2,2,1,1,
            1,1,1,4,6,4,1,1,1,1,
            1,1,0,1,2,4,1,3,1,1,
            4,1,1,1,3,1,1,3,0,5,
            4,4,0,1,0,1,0,3,0,2,
            4,0,2,4,6,9,11,9,2,2,
            0,1,2,6,9,2,0,3,1,1,
            1,1,1,1,3,0,4,0,1,1,
            1,1,2,3,5,6,0,3,1,1,
            5,0,1,8,0,2,0,2,6,0,
            4,0,2,6,10,0,1,-51,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,-65,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,-2,0,0,0,0,0,
            0,0,0,-5,0,0,0,-92,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,-66,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,-4,0,0,0,0,0,
            0,0,0,-16,0,0,0,-72,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,-152,
            0,0,-102,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,-12,0,0,-151,0,-129,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,-49,0,0,
            0,0,-134,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,-71,0,0,0,0,-67,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,-81,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,-82,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,-83,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,-84,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,-85,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,-97,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,-100,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,-109,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,-117,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,-144,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,-147,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,-148,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,-153,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,-155,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,-171,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,-174,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,-132,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,-160,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,-110,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            -93,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,-143,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            -94,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,-170,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,-179,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,-180,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,-108,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,-95,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            -96,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            -107,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            -106,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,-124,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,-105,0,0,0,
            0,0,0,0,0,-32,0,0,0,0,
            0,-35,0,0,0,0,0,-58,0,0,
            0,0,0,-33,0,0,0,0,0,-36,
            0,0,0,0,0,-55,0,0,0,0,
            0,0,-30,-1,-64,-31,-74,0,-28,0,
            -29,0,-6,0,-57,0,0,0,0,0,
            -88,0,0,0,0,0,-101,0,0,0,
            0,0,-121,0,0,0,0,0,-10,0,
            0,0,0,0,0,-8,-13,0,-42,-14,
            0,-44,-80,0,0,-89,0,-15,-91,0,
            -75,-115,-87,-11,-119,0,-73,-135,0,0,
            -142,0,-137,-154,-7,0,0,0,0,0,
            0,0,0,0,-165,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,-166,0,0,-172,
            0,-24,-181,-25,0,0,0,0,0,0,
            0,-34,-112,0,-60,-3,-9,-20,-113,-21,
            -22,-27,-130,0,-159,-118,0,0,0,0,
            0,0,0,0,0,-156,0,-161,0,-162,
            -173,0,-178,0,0,0,0,-183,0,0,
            0,0,0,0,0,0,-17,-18,-19,-23,
            -26,-37,-38,-39,0,0,-40,-41,-43,-45,
            -46,-47,-48,-50,-52,-53,-54,-56,-59,-61,
            0,-62,-63,-68,-69,-70,-76,0,0,-77,
            -78,0,-79,-86,-90,-98,-99,0,-103,0,
            -104,0,-111,-114,-116,-120,-122,-123,-125,-126,
            -127,-128,-131,-133,0,-136,-138,-139,-140,-141,
            -145,-146,-149,-150,-157,-158,-163,-164,-167,-168,
            -169,-175,-176,-177,-182,-184,0
        };
    };
    public final static short baseCheck[] = BaseCheck.baseCheck;
    public final int baseCheck(int index) { return baseCheck[index]; }
    public final static short rhs[] = baseCheck;
    public final int rhs(int index) { return rhs[index]; };

    public interface BaseAction {
        public final static char baseAction[] = {
            62,28,29,29,27,27,25,25,26,26,
            24,24,41,41,23,23,21,21,22,22,
            20,20,63,63,63,63,63,63,19,19,
            64,64,17,17,65,65,18,18,18,42,
            42,9,9,10,10,10,10,10,10,10,
            10,10,6,6,6,6,15,15,16,11,
            11,14,12,13,7,7,7,8,8,8,
            8,8,8,74,74,36,36,34,34,3,
            3,4,5,5,5,2,2,1,1,62,
            62,37,37,45,45,66,66,33,33,43,
            43,46,44,44,47,39,39,39,39,35,
            35,40,40,40,38,38,32,48,48,49,
            49,49,49,49,49,31,56,56,30,30,
            50,50,50,57,58,58,58,68,68,67,
            59,51,69,69,52,70,70,60,60,53,
            61,61,71,71,54,55,72,72,1,86,
            80,54,79,1498,50,55,1514,36,1387,44,
            45,46,47,48,49,1325,1327,1381,1513,1512,
            1517,11,1510,5,1521,3,140,1,260,86,
            80,54,79,1498,50,55,1514,38,1387,44,
            45,46,47,48,49,33,116,1445,119,120,
            121,122,123,124,344,130,131,132,1,86,
            80,54,79,1498,50,55,1514,36,1387,44,
            45,46,47,48,49,1325,1327,1381,1513,1512,
            1517,11,1510,5,1521,3,140,1,260,86,
            80,54,79,1498,50,55,1514,37,1387,44,
            45,46,47,48,49,286,118,1445,119,120,
            121,122,123,124,309,130,131,132,34,86,
            80,54,79,1498,50,55,1514,36,1387,44,
            45,46,47,48,49,1325,1327,1381,1513,1512,
            1517,11,1510,5,1521,3,1531,1,1333,1490,
            463,1395,1529,78,86,80,54,79,1498,50,
            55,1514,36,1387,44,45,46,47,48,49,
            1325,1327,1381,1513,1512,1517,11,1510,5,1521,
            3,1531,1,59,86,1488,464,1542,106,86,
            80,54,79,1498,50,55,1514,36,1387,44,
            45,46,47,48,49,1325,1327,1381,1513,1512,
            1517,11,1510,5,1521,3,1531,1,59,86,
            1509,1558,78,106,86,80,54,79,1498,50,
            55,1514,36,1387,44,45,46,47,48,49,
            1325,1327,1381,1513,1512,1517,11,1510,5,1521,
            3,1531,1,59,86,58,1470,1553,106,86,
            80,1527,79,1498,50,55,1514,36,1387,44,
            45,46,47,48,49,1325,1327,1381,1513,1512,
            1517,11,1510,5,1521,3,1526,1,106,86,
            80,54,79,1498,50,55,1514,36,1387,44,
            45,46,47,48,49,1325,1327,1381,1513,1512,
            1517,11,1510,5,1521,3,133,1,106,86,
            80,54,79,1498,50,55,1514,36,1387,44,
            45,46,47,48,49,1325,1327,1381,1513,1512,
            1517,11,1510,5,1521,3,1449,1,106,86,
            80,54,79,1498,50,55,1514,36,1387,44,
            45,46,47,48,49,1325,1327,1381,1513,1512,
            1517,11,1510,5,1521,3,1534,1,106,86,
            80,54,79,1498,50,55,1514,36,1387,44,
            45,46,47,48,49,1325,1327,1381,1513,1512,
            1517,11,1510,5,1521,3,1382,1,106,86,
            80,54,79,1498,50,55,1514,36,1387,44,
            45,46,47,48,49,1325,1327,1381,1513,1512,
            1517,11,1510,5,1521,3,1535,1,106,86,
            80,54,79,1498,50,55,1514,36,1387,44,
            45,46,47,48,49,1325,1327,1381,1513,1512,
            1517,11,1510,5,1521,3,1526,1,134,86,
            80,54,79,1498,50,55,1514,36,1387,44,
            45,46,47,48,49,1325,1327,1381,1513,1512,
            1517,11,1510,5,1521,3,1539,1,106,86,
            80,54,79,1498,50,55,1514,36,1387,44,
            45,46,47,48,49,1325,1327,1381,1513,1512,
            1517,11,1510,5,1521,3,1543,1,106,86,
            80,54,79,1498,50,55,1514,36,1387,44,
            45,46,47,48,49,1325,1327,1381,1513,1512,
            1517,11,1510,5,1521,3,1548,1,106,86,
            80,54,79,1498,50,55,1514,36,1387,44,
            45,46,47,48,49,1325,1327,1381,1513,1512,
            1517,11,1510,5,1521,3,1556,1,106,86,
            80,54,79,1498,50,55,1514,36,1387,44,
            45,46,47,48,49,1325,1327,1381,1513,1512,
            1517,11,1510,5,1521,3,1468,1,106,86,
            80,54,79,1498,50,55,1514,36,1387,44,
            45,46,47,48,49,1325,1327,1381,1513,1512,
            1517,11,1510,5,1521,3,135,1,106,86,
            80,54,79,1498,50,55,1514,36,1387,44,
            45,46,47,48,49,1325,1327,1381,1513,1512,
            1517,11,1510,5,1521,3,1427,1,106,86,
            80,54,79,1498,50,55,1514,36,1387,44,
            45,46,47,48,49,1325,1327,1381,1513,1512,
            1517,11,1510,5,1521,3,1560,1,106,86,
            80,54,79,1498,50,55,1514,36,1387,44,
            45,46,47,48,49,1325,1327,1381,1513,1512,
            1517,11,1510,5,1521,3,148,1,106,86,
            80,54,79,1498,50,55,1514,36,1387,44,
            45,46,47,48,49,1325,1327,1381,1513,1512,
            1517,11,1510,5,1521,3,1473,1,187,86,
            80,54,79,1498,50,55,1514,36,1387,44,
            45,46,47,48,49,1325,1327,1381,1513,1512,
            1517,11,1510,5,1521,1552,187,86,80,54,
            79,1498,50,55,1514,36,1387,44,45,46,
            47,48,49,1325,1327,1381,1513,1512,1517,11,
            1510,5,1521,2,162,86,80,54,79,1498,
            50,55,1514,36,1387,44,45,46,47,48,
            49,1325,1327,1381,1513,1512,1517,11,1510,7,
            1521,162,86,80,54,79,1498,50,55,1514,
            36,1387,44,45,46,47,48,49,1325,1327,
            1381,1513,1512,1517,11,1538,162,86,80,54,
            79,1498,50,55,1514,36,1387,44,45,46,
            47,48,49,1325,1327,1381,1513,1512,1517,11,
            9,212,86,80,54,79,1498,50,55,1514,
            36,1387,44,45,46,47,48,49,1325,1327,
            1381,1513,1512,1517,15,212,86,80,54,79,
            1498,50,55,1514,36,1387,44,45,46,47,
            48,49,1325,1327,1381,1513,1512,1517,1563,212,
            86,80,54,79,1498,50,55,1514,36,1387,
            44,45,46,47,48,49,1325,1327,1381,1513,
            1512,1517,1565,212,86,80,54,79,1498,50,
            55,1514,36,1387,44,45,46,47,48,49,
            1325,1327,1381,1513,1512,1517,1478,212,86,80,
            54,79,1498,50,55,1514,36,1387,44,45,
            46,47,48,49,1325,1327,1381,1513,17,1517,
            212,86,80,54,79,1498,50,55,1514,36,
            1387,44,45,46,47,48,49,1325,1327,1381,
            19,212,86,80,54,79,1498,50,55,1514,
            36,1387,44,45,46,47,48,49,1325,1327,
            29,212,86,80,54,79,1498,50,55,1514,
            36,1387,44,45,46,47,48,49,1325,1327,
            21,212,86,80,54,79,1498,50,55,1514,
            36,1387,44,45,46,47,48,49,33,1327,
            260,86,80,54,79,1498,50,55,1514,4,
            1387,44,45,46,47,48,49,284,86,80,
            54,79,1498,1453,55,1514,300,86,80,1497,
            79,1498,26,86,80,1497,79,1498,26,86,
            80,1497,79,1498,26,86,80,1369,79,1498,
            26,86,80,1372,79,1498,26,86,80,1376,
            79,1498,1494,292,267,340,292,317,1499,290,
            88,290,85,341,76,26,86,80,1379,79,
            1498,26,86,80,1385,79,1498,26,86,80,
            1541,79,1498,26,86,80,1391,79,1498,32,
            94,1378,1370,94,1378,1370,62,345,92,361,
            348,91,361,59,86,139,361,1359,351,361,
            1384,266,361,402,341,361,205,388,361,1201,
            1446,361,1241,428,361,286,90,1378,1370,1505,
            158,1504,1505,158,1507,361,1505,158,1536,1505,
            158,1537,1505,158,1393,1505,158,1550,1505,158,
            1554,1505,158,1555,1505,158,1559,361,103,42,
            361,1384,103,361,103,1505,158,153,100,125,
            1443,1395,103,419,1221,361,302,302,302,423,
            302,302,302,437,310,469,361,1505,158,1471,
            1505,158,1564,1505,158,1566,402,112,472,112,
            472,428,110,485,109,1505,218,112,469,265,
            98,101,113,1323,1326,104,1549,159,354,325,
            333,337,112,350,330,40,1561,359,355,369,
            168,364,365,372,368,382,379,373,383,384,
            385,1544,386,387,72,392,324,391,1388,13,
            395,396,127,406,400,409,411,412,136,413,
            1430,414,151,415,416,420,425,426,432,427,
            306,435,442,446,342,1433,438,449,451,453,
            455,459,460,461,7,465,468,480,470,473,
            476,478,482,484,483,486,487,1569,1569
        };
    };
    public final static char baseAction[] = BaseAction.baseAction;
    public final int baseAction(int index) { return baseAction[index]; }
    public final static char lhs[] = baseAction;
    public final int lhs(int index) { return lhs[index]; };

    public interface TermCheck {
        public final static byte termCheck[] = {0,
            0,1,2,3,4,5,0,7,8,9,
            10,11,12,13,14,15,16,17,18,19,
            20,21,22,23,24,0,1,27,3,4,
            5,0,0,0,1,2,3,4,5,39,
            7,8,9,10,11,12,13,14,15,16,
            17,18,19,20,21,22,23,24,0,1,
            27,0,0,63,64,32,35,36,68,8,
            70,0,40,2,74,69,76,0,1,2,
            3,4,5,6,7,8,9,10,11,12,
            13,14,15,16,17,18,19,20,21,22,
            23,24,0,1,27,0,1,2,3,4,
            5,0,7,8,9,10,11,12,13,14,
            15,16,17,18,19,20,21,22,23,24,
            28,29,27,0,1,2,3,4,5,28,
            7,8,9,10,11,12,13,14,15,16,
            17,18,19,20,21,22,23,24,0,1,
            27,0,1,2,3,4,5,0,7,8,
            9,10,11,12,13,14,15,16,17,18,
            19,20,21,22,23,24,0,1,2,3,
            4,5,25,7,8,9,10,11,12,13,
            14,15,16,17,18,19,20,21,22,23,
            24,0,1,2,3,4,5,0,7,8,
            9,10,11,12,13,14,15,16,17,18,
            19,20,21,22,23,0,1,2,3,4,
            5,0,7,8,9,10,11,12,13,14,
            15,16,17,18,19,20,21,22,23,0,
            1,2,3,4,5,0,0,8,9,10,
            11,12,13,14,15,16,0,18,19,20,
            21,22,23,0,1,0,3,4,5,0,
            1,0,9,10,11,12,13,14,15,0,
            1,0,3,4,5,0,40,2,0,1,
            0,1,7,3,4,5,0,52,53,54,
            55,56,57,0,0,2,35,36,29,0,
            7,7,0,28,2,6,0,29,2,0,
            0,0,41,0,0,29,61,0,82,0,
            0,28,28,0,0,6,17,25,0,1,
            0,25,33,0,0,60,25,0,0,26,
            26,0,0,26,6,59,26,17,0,26,
            39,0,0,0,0,0,0,0,6,25,
            0,0,29,2,0,0,2,58,31,0,
            46,0,62,25,33,0,1,26,0,37,
            0,0,0,0,0,0,6,6,0,0,
            2,34,0,1,0,0,0,0,42,45,
            47,0,6,25,0,50,0,0,1,49,
            6,0,41,48,32,0,33,6,0,1,
            0,6,0,38,0,31,31,38,0,0,
            0,30,0,0,0,51,6,0,0,0,
            34,0,0,6,16,0,77,0,26,0,
            1,0,0,0,0,0,0,0,0,30,
            0,37,0,0,0,31,0,0,71,0,
            0,0,0,0,0,0,0,0,0,0,
            0,30,44,30,0,0,0,32,0,0,
            43,0,0,0,0,0,0,0,78,66,
            0,0,0,0,72,0,65,0,0,0,
            0,0,73,0,0,0,0,75,0,67,
            0,0,0,0,79,0,0,0,0,0,
            0,0,0,0,80,0,0,81,0,0
        };
    };
    public final static byte termCheck[] = TermCheck.termCheck;
    public final int termCheck(int index) { return termCheck[index]; }

    public interface TermAction {
        public final static char termAction[] = {0,
            117,1516,418,1651,1652,1653,1569,248,1612,1515,
            1636,1637,1638,1639,1640,1641,278,188,1631,1632,
            413,1628,1629,1630,1520,1569,1489,1523,1651,1652,
            1653,1569,1569,1569,1516,418,1651,1652,1653,508,
            248,1612,1515,1636,1637,1638,1639,1640,1641,278,
            188,1631,1632,413,1628,1629,1630,1520,1569,1489,
            1523,1569,1569,448,1373,1626,274,1487,478,1367,
            538,1569,1568,628,568,1710,1524,1569,1516,418,
            1651,1652,1653,1622,248,1612,1515,1636,1637,1638,
            1639,1640,1641,278,188,1631,1632,413,1628,1629,
            1630,1520,111,1432,1523,1569,1516,418,1651,1652,
            1653,87,248,1612,1515,1636,1637,1638,1639,1640,
            1641,278,188,1631,1632,413,1628,1629,1630,1520,
            1442,1434,1523,1569,1540,418,1651,1652,1653,1329,
            248,1612,1515,1636,1637,1638,1639,1640,1641,278,
            188,1631,1632,413,1628,1629,1630,1520,1569,1491,
            1523,1569,1516,598,1651,1652,1653,1569,248,1612,
            1515,1636,1637,1638,1639,1640,1641,278,188,1631,
            1632,413,1628,1629,1630,1520,1569,1516,418,1651,
            1652,1653,1316,248,1612,1515,1636,1637,1638,1639,
            1640,1641,278,188,1631,1632,413,1628,1629,1630,
            1520,1569,1516,598,1651,1652,1653,1569,248,1612,
            1515,1636,1637,1638,1639,1640,1641,278,188,1631,
            1632,413,1628,1629,1630,28,1600,1600,1600,1600,
            1600,1569,1600,1600,1600,1600,1600,1600,1600,1600,
            1600,1600,1600,1600,1600,1600,1600,1600,1600,1569,
            1516,598,1651,1652,1653,20,95,1612,1515,1636,
            1637,1638,1639,1640,1641,278,1569,1631,1632,413,
            1628,1629,1630,1569,1516,99,1651,1652,1653,1569,
            1492,93,1515,1636,1637,1638,1639,1640,1641,1569,
            1489,97,1651,1652,1653,87,89,313,1569,1432,
            75,1298,1331,1298,1298,1298,32,1591,1592,1593,
            1594,1595,1596,87,87,313,274,1487,1493,1569,
            1331,1331,1569,1329,1286,1502,1569,1434,1292,28,
            102,134,214,1569,1569,1603,1366,1569,1665,1569,
            1569,1329,1329,1569,1569,1500,1962,1304,1569,1503,
            128,1310,1501,1569,1569,718,778,1569,1569,1447,
            1448,75,1569,1450,1506,1604,1451,1698,1569,1452,
            748,1569,1569,1569,8,14,18,41,1525,1335,
            16,1569,1508,1347,1569,6,658,1599,1674,1569,
            378,126,343,1341,2037,1569,1533,1383,1569,1683,
            1569,54,1569,77,1569,1569,1620,1260,137,1569,
            383,1277,142,1712,1569,1569,1569,150,1180,1011,
            1650,1569,1635,1353,1569,1061,39,1569,346,1157,
            1633,1569,1456,984,1625,1569,348,1621,1569,1394,
            1569,1551,1569,1546,1569,1677,1675,1547,1569,1569,
            1569,1036,152,145,1569,928,1707,1569,12,1569,
            1277,147,1569,1634,1455,1569,688,1569,1466,1569,
            1715,1569,1569,1569,156,1569,1569,1569,1569,956,
            1569,1684,1569,1569,1569,1676,1569,1569,808,1569,
            1569,1569,1569,1569,1569,1569,1569,1569,1569,1569,
            1569,1109,1085,1133,1569,1569,1569,1579,1569,1569,
            1562,1569,1569,1569,1569,1569,1569,1569,838,1557,
            1569,1569,1569,1569,1405,1569,868,1569,1569,1569,
            1569,1569,1718,1569,1569,1569,1569,1723,1569,1713,
            1569,1569,1569,1569,898,1569,1569,1569,1569,1569,
            1569,1569,1569,1569,1726,1569,1569,1724
        };
    };
    public final static char termAction[] = TermAction.termAction;
    public final int termAction(int index) { return termAction[index]; }

    public interface Asb {
        public final static char asb[] = {0,
            69,144,71,1,183,73,1,77,70,74,
            73,119,183,183,183,66,119,183,149,71,
            141,141,128,125,125,128,72,119,119,142,
            142,63,116,125,116,116,150,230,229,119,
            185,182,230,182,135,224,135,229,119,187,
            80,183,135,189,116,230,116,116,191,182,
            170,167,165,158,100,100,96,258,258,193,
            119,6,155,156,159,166,258,171,119,119,
            96,96,96,96,96,226,79,116,182,135,
            182,80,97,98,98,98,96,230,208,96,
            116,32,30,228,109,98,98,98,96,97,
            232,131,137,234,182,234,96,182,182,187,
            116,187,236,100,230,238,230,230,96,155,
            230,97,132,96,182,119,121,119,260,183,
            189,182,97,96,56,236,96,96,230,262,
            58,122,96,182,96,79,187,230,146,97,
            59,59,119,123,182,182,264,266,147,98,
            96,182,121,96,236,236,268,181,98,98,
            182,30,146,270
        };
    };
    public final static char asb[] = Asb.asb;
    public final int asb(int index) { return asb[index]; }

    public interface Asr {
        public final static byte asr[] = {0,
            62,35,36,61,0,2,7,17,8,1,
            3,4,5,9,10,11,12,13,14,15,
            20,16,23,19,18,21,22,24,27,32,
            0,2,7,17,8,1,3,4,5,9,
            10,11,12,13,14,15,20,23,19,18,
            21,22,24,27,6,16,0,66,17,26,
            65,0,3,4,5,29,1,0,82,40,
            61,41,62,36,35,0,8,0,41,31,
            37,67,69,71,72,73,75,81,76,74,
            70,39,68,63,64,27,24,7,17,8,
            2,20,16,23,19,18,21,22,9,10,
            11,12,13,14,15,3,4,5,1,0,
            71,72,73,0,29,1,28,25,2,0,
            2,17,26,39,25,0,17,26,1,0,
            41,36,35,40,0,44,43,0,7,2,
            47,25,39,28,34,29,59,58,52,53,
            54,55,56,57,42,49,43,44,50,45,
            1,30,6,32,33,65,38,78,79,48,
            80,17,26,0,46,0,31,0,37,0,
            47,0,1,43,44,30,32,33,65,38,
            78,79,80,26,2,7,28,42,45,48,
            49,50,52,53,54,55,56,57,58,17,
            59,34,6,29,0,77,0,32,33,6,
            0,51,0,38,0,30,0,42,45,6,
            48,49,50,52,53,54,55,56,57,58,
            17,29,59,34,60,7,28,2,0,78,
            0,69,0,75,0,79,0,67,0,81,
            0
        };
    };
    public final static byte asr[] = Asr.asr;
    public final int asr(int index) { return asr[index]; }

    public interface Nasb {
        public final static byte nasb[] = {0,
            32,5,64,6,5,41,6,5,64,43,
            41,12,5,5,5,8,5,5,5,64,
            64,64,5,60,60,5,64,39,39,28,
            28,24,17,60,24,17,5,5,5,5,
            5,47,5,47,5,5,5,5,12,5,
            1,5,5,5,17,5,17,24,5,47,
            5,5,5,35,2,2,16,5,5,5,
            12,2,56,37,52,5,5,5,5,50,
            2,2,2,2,2,5,54,17,47,5,
            47,1,2,2,2,2,2,5,5,2,
            17,2,5,5,20,2,2,2,2,2,
            5,62,66,5,47,5,2,48,47,5,
            17,5,5,2,5,5,5,5,2,56,
            5,2,5,2,47,5,58,5,5,5,
            5,47,2,2,5,5,2,2,5,5,
            14,10,2,47,2,54,5,5,68,2,
            70,70,5,5,47,47,5,5,5,2,
            2,47,58,2,5,5,5,72,2,2,
            47,5,68,5
        };
    };
    public final static byte nasb[] = Nasb.nasb;
    public final int nasb(int index) { return nasb[index]; }

    public interface Nasr {
        public final static char nasr[] = {0,
            48,5,8,10,0,46,0,35,0,71,
            0,2,0,70,0,8,5,3,0,5,
            8,6,0,5,3,36,0,38,39,45,
            0,66,62,0,64,0,65,0,1,0,
            47,0,38,39,37,0,31,30,0,67,
            0,63,0,56,0,42,0,61,0,40,
            0,68,0,33,0,69,0,41,0,60,
            0,72,0
        };
    };
    public final static char nasr[] = Nasr.nasr;
    public final int nasr(int index) { return nasr[index]; }

    public interface TerminalIndex {
        public final static byte terminalIndex[] = {0,
            30,4,43,44,45,5,11,31,46,47,
            48,49,50,51,52,6,22,32,33,37,
            38,39,40,35,61,82,34,2,23,3,
            56,7,26,25,55,57,58,63,65,81,
            83,36,41,42,1,8,9,10,12,13,
            14,15,16,17,18,19,20,21,24,27,
            53,54,59,60,62,64,66,67,68,69,
            70,71,72,73,74,75,76,77,78,79,
            80,28,84
        };
    };
    public final static byte terminalIndex[] = TerminalIndex.terminalIndex;
    public final int terminalIndex(int index) { return terminalIndex[index]; }

    public interface NonterminalIndex {
        public final static byte nonterminalIndex[] = {0,
            110,106,87,0,109,103,0,107,88,104,
            0,0,0,0,0,0,98,100,96,95,
            93,94,92,91,89,90,86,85,0,0,
            118,117,0,105,116,108,111,112,113,0,
            0,102,0,0,0,114,115,0,119,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,97,99,101,0,120,0,0,0,
            0,0,0,0
        };
    };
    public final static byte nonterminalIndex[] = NonterminalIndex.nonterminalIndex;
    public final int nonterminalIndex(int index) { return nonterminalIndex[index]; }

    public interface ScopePrefix {
        public final static char scopePrefix[] = {
            1,87,29,97,13,21,57,39,128,51,
            68,121,109,63,72,75,80,46
        };
    };
    public final static char scopePrefix[] = ScopePrefix.scopePrefix;
    public final int scopePrefix(int index) { return scopePrefix[index]; }

    public interface ScopeSuffix {
        public final static char scopeSuffix[] = {
            11,66,37,104,19,27,55,44,133,55,
            55,125,113,66,55,78,83,48
        };
    };
    public final static char scopeSuffix[] = ScopeSuffix.scopeSuffix;
    public final int scopeSuffix(int index) { return scopeSuffix[index]; }

    public interface ScopeLhs {
        public final static char scopeLhs[] = {
            55,24,52,24,54,53,7,51,29,7,
            6,26,24,15,10,42,41,48
        };
    };
    public final static char scopeLhs[] = ScopeLhs.scopeLhs;
    public final int scopeLhs(int index) { return scopeLhs[index]; }

    public interface ScopeLa {
        public final static byte scopeLa[] = {
            81,32,67,43,75,73,6,69,30,6,
            6,30,6,32,6,34,30,17
        };
    };
    public final static byte scopeLa[] = ScopeLa.scopeLa;
    public final int scopeLa(int index) { return scopeLa[index]; }

    public interface ScopeStateSet {
        public final static byte scopeStateSet[] = {
            46,20,46,20,46,46,7,46,25,7,
            7,22,20,8,8,4,1,46
        };
    };
    public final static byte scopeStateSet[] = ScopeStateSet.scopeStateSet;
    public final int scopeStateSet(int index) { return scopeStateSet[index]; }

    public interface ScopeRhs {
        public final static char scopeRhs[] = {0,
            115,155,111,79,111,78,111,77,76,0,
            80,0,115,1,38,111,74,0,74,0,
            154,144,115,111,70,0,72,0,115,143,
            153,1,38,111,39,0,66,0,115,152,
            111,68,0,68,0,132,0,118,0,0,
            111,2,91,0,5,0,111,60,1,2,
            91,0,117,16,0,7,0,117,2,1,
            0,111,2,0,89,34,0,102,0,106,
            44,0,3,92,0,0,106,30,43,124,
            16,6,111,2,24,0,124,16,6,111,
            2,24,0,41,3,92,7,0,111,2,
            24,0,5,6,0,41,3,92,7,0,
            107,45,107,0,3,91,0,110,51,1,
            27,0,3,86,0
        };
    };
    public final static char scopeRhs[] = ScopeRhs.scopeRhs;
    public final int scopeRhs(int index) { return scopeRhs[index]; }

    public interface ScopeState {
        public final static char scopeState[] = {0,
            1478,1455,0,1453,1387,0,1277,1133,1109,1085,
            1260,1157,1221,1241,1201,1180,1061,248,188,1036,
            1011,956,928,984,898,868,838,808,778,748,
            718,383,348,688,658,313,628,598,568,538,
            508,478,448,278,418,218,158,0
        };
    };
    public final static char scopeState[] = ScopeState.scopeState;
    public final int scopeState(int index) { return scopeState[index]; }

    public interface InSymb {
        public final static char inSymb[] = {0,
            0,145,149,116,41,126,129,61,26,127,
            130,62,8,122,121,35,36,85,1,26,
            26,26,118,1,29,1,26,28,7,116,
            116,2,25,28,2,25,1,29,119,86,
            88,86,119,86,6,33,6,1,46,115,
            114,113,6,115,25,29,25,33,85,132,
            107,104,103,100,17,7,2,91,9,1,
            20,16,93,101,102,105,24,109,27,64,
            63,68,39,70,74,76,26,25,86,6,
            86,114,45,50,42,147,2,111,86,2,
            2,2,117,111,34,148,146,49,2,48,
            1,150,111,111,111,111,77,41,86,115,
            25,115,107,6,111,1,86,117,33,89,
            111,51,151,2,152,38,115,38,111,113,
            115,86,30,60,6,110,39,25,117,115,
            1,144,71,1,78,26,115,111,16,30,
            111,153,66,154,72,111,115,111,124,44,
            65,143,115,79,43,106,115,111,30,30,
            155,106,106,115
        };
    };
    public final static char inSymb[] = InSymb.inSymb;
    public final int inSymb(int index) { return inSymb[index]; }

    public interface Name {
        public final static String name[] = {
            "",
            "?",
            "::",
            ":",
            "(",
            ")",
            "{",
            "}",
            "[",
            "]",
            "->",
            "!",
            "&&",
            "||",
            "=",
            "==",
            "!=",
            ">=",
            "<=",
            ">",
            "<",
            "+",
            "-",
            "*",
            "/",
            ".",
            ",",
            "|",
            "\\u00AB",
            "$empty",
            "IDENT",
            "STRING",
            "INT_CONST",
            "REAL_CONST",
            "let",
            "switch",
            "implies",
            "new",
            "false",
            "true",
            "null",
            "default",
            "case",
            "Collection",
            "List",
            "Set",
            "typeSelect",
            "collect",
            "select",
            "reject",
            "exists",
            "notExists",
            "forAll",
            "IMPORT",
            "EXTENSION",
            "AROUND",
            "ENDAROUND",
            "DEFINE",
            "ENDDEFINE",
            "ERROR",
            "EXPAND",
            "FOR",
            "SEPARATOR",
            "AS",
            "ITERATOR",
            "FOREACH",
            "ENDFOREACH",
            "FILE",
            "ENDFILE",
            "IF",
            "ELSEIF",
            "ELSE",
            "ENDIF",
            "LET",
            "ENDLET",
            "PROTECT",
            "CSTART",
            "CEND",
            "ID",
            "DISABLE",
            "ENDPROTECT",
            "EOF_TOKEN",
            "TEXT",
            "COMMENT",
            "ERROR_TOKEN",
            "expression",
            "castedExpression",
            "type",
            "infixExpression",
            "chainExpression",
            "ifExpression",
            "switchExpression",
            "orExpression",
            "andExpression",
            "impliesExpression",
            "relationalExpression",
            "additiveExpression",
            "relationalOperator",
            "multiplicativeExpression",
            "additiveOperator",
            "unaryExpression",
            "multiplicativeOperator",
            "infixExpressionSuffix",
            "featureCall",
            "primaryExpression",
            "parameterList",
            "simpleType",
            "collectionExpressionName",
            "declaredParameterList",
            "collectionTypeName",
            "qualifiedType",
            "defineOrAroundSeq",
            "define",
            "around",
            "anImport",
            "anExtensionImport",
            "pointcut",
            "sequence",
            "text",
            "statement",
            "definitionName"
        };
    };
    public final static String name[] = Name.name;
    public final String name(int index) { return name[index]; }

    public final static int
           ERROR_SYMBOL      = 83,
           SCOPE_UBOUND      = 17,
           SCOPE_SIZE        = 18,
           MAX_NAME_LENGTH   = 24;

    public final int getErrorSymbol() { return ERROR_SYMBOL; }
    public final int getScopeUbound() { return SCOPE_UBOUND; }
    public final int getScopeSize() { return SCOPE_SIZE; }
    public final int getMaxNameLength() { return MAX_NAME_LENGTH; }

    public final static int
           NUM_STATES        = 184,
           NT_OFFSET         = 83,
           LA_STATE_OFFSET   = 1726,
           MAX_LA            = 2,
           NUM_RULES         = 157,
           NUM_NONTERMINALS  = 74,
           NUM_SYMBOLS       = 157,
           SEGMENT_SIZE      = 8192,
           START_STATE       = 1324,
           IDENTIFIER_SYMBOL = 0,
           EOFT_SYMBOL       = 40,
           EOLT_SYMBOL       = 40,
           ACCEPT_ACTION     = 1568,
           ERROR_ACTION      = 1569;

    public final static boolean BACKTRACK = false;

    public final int getNumStates() { return NUM_STATES; }
    public final int getNtOffset() { return NT_OFFSET; }
    public final int getLaStateOffset() { return LA_STATE_OFFSET; }
    public final int getMaxLa() { return MAX_LA; }
    public final int getNumRules() { return NUM_RULES; }
    public final int getNumNonterminals() { return NUM_NONTERMINALS; }
    public final int getNumSymbols() { return NUM_SYMBOLS; }
    public final int getSegmentSize() { return SEGMENT_SIZE; }
    public final int getStartState() { return START_STATE; }
    public final int getStartSymbol() { return lhs[0]; }
    public final int getIdentifierSymbol() { return IDENTIFIER_SYMBOL; }
    public final int getEoftSymbol() { return EOFT_SYMBOL; }
    public final int getEoltSymbol() { return EOLT_SYMBOL; }
    public final int getAcceptAction() { return ACCEPT_ACTION; }
    public final int getErrorAction() { return ERROR_ACTION; }
    public final boolean isValidForParser() { return isValidForParser; }
    public final boolean getBacktrack() { return BACKTRACK; }

    public final int originalState(int state) {
        return -baseCheck[state];
    }
    public final int asi(int state) {
        return asb[originalState(state)];
    }
    public final int nasi(int state) {
        return nasb[originalState(state)];
    }
    public final int inSymbol(int state) {
        return inSymb[originalState(state)];
    }

    public final int ntAction(int state, int sym) {
        return baseAction[state + sym];
    }

    public final int tAction(int state, int sym) {
        int i = baseAction[state],
            k = i + sym;
        return termAction[termCheck[k] == sym ? k : i];
    }
    public final int lookAhead(int la_state, int sym) {
        int k = la_state + sym;
        return termAction[termCheck[k] == sym ? k : la_state];
    }
}

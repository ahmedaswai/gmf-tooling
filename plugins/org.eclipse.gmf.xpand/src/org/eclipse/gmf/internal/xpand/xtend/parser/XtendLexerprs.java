/*******************************************************************************
 * Copyright (c) 2006 Eclipse.org
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.gmf.internal.xpand.xtend.parser;

public class XtendLexerprs implements lpg.lpgjavaruntime.ParseTable, XtendLexersym {

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
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0
        };
    };
    public final static byte isKeyword[] = IsKeyword.isKeyword;
    public final boolean isKeyword(int index) { return isKeyword[index] != 0; }

    public interface BaseCheck {
        public final static byte baseCheck[] = {0,
            1,3,3,1,3,1,1,1,1,1,
            2,2,1,1,1,1,1,2,2,2,
            2,1,1,1,1,2,1,1,1,2,
            1,1,1,1,5,1,1,2,3,1,
            2,2,1,1,1,1,1,1,1,1,
            1,1,1,1,1,1,1,1,1,1,
            1,1,1,1,1,1,1,1,1,1,
            1,1,1,1,1,1,1,1,1,1,
            1,1,1,1,1,1,1,1,1,1,
            1,1,1,1,1,1,1,1,1,1,
            1,1,1,1,1,1,1,1,1,1,
            1,1,1,2,1,1,1,1,1,1,
            1,1,1,1,1,1,1,1,1,1,
            1,1,1,1,1,1,1,1,1,1,
            1,1,2,2,1,1,1,1,1,1,
            1,1,1,1,1,1,1,3,2,2,
            0,1,2,1,2,0,1,1,1,1,
            1,1,1,1,1,1,1,1,1,1,
            1,1,1,1,1,1,1,1,1,1,
            1,1,1,1,1,1,1,1,1,6,
            2,2,2,2,2,2,2,2,1,1,
            1,1,1,1,1,1,1,1,1,1,
            1,1,1
        };
    };
    public final static byte baseCheck[] = BaseCheck.baseCheck;
    public final int baseCheck(int index) { return baseCheck[index]; }
    public final static byte rhs[] = baseCheck;
    public final int rhs(int index) { return rhs[index]; };

    public interface BaseAction {
        public final static char baseAction[] = {
            17,17,17,17,17,17,17,17,17,17,
            17,17,17,17,17,17,17,17,17,17,
            17,17,17,17,17,17,17,17,17,17,
            17,17,17,17,17,17,17,14,14,18,
            12,12,12,2,2,2,3,3,3,3,
            3,3,3,3,3,3,3,3,3,3,
            3,3,3,3,3,3,3,3,3,3,
            3,3,4,4,4,4,4,4,4,4,
            4,4,4,4,4,4,4,4,4,4,
            4,4,4,4,4,4,4,4,1,1,
            1,1,1,1,1,1,1,1,5,5,
            5,5,5,19,19,8,8,8,8,8,
            8,8,8,8,8,8,8,8,8,8,
            8,8,8,8,8,8,8,8,8,8,
            8,8,8,22,22,23,23,23,23,23,
            23,23,23,23,15,15,15,15,20,20,
            20,20,21,21,16,16,13,13,10,10,
            10,10,10,10,10,10,10,10,10,10,
            10,10,10,10,10,10,10,10,10,10,
            10,10,10,10,10,9,9,9,9,9,
            9,11,11,11,11,11,11,11,11,7,
            7,7,7,7,7,7,7,7,7,7,
            7,6,6,17,493,37,40,43,44,113,
            470,199,146,145,43,44,319,806,252,150,
            804,230,6,240,837,114,231,299,196,195,
            43,44,814,38,144,838,164,197,199,296,
            287,825,38,290,299,196,195,43,44,839,
            840,807,841,164,197,199,842,295,805,281,
            290,1,155,154,43,44,157,843,836,156,
            396,196,195,43,44,844,160,354,354,165,
            197,199,303,100,155,154,43,44,157,354,
            354,156,657,37,40,43,44,354,158,592,
            42,41,43,44,327,354,261,722,42,41,
            43,44,787,221,787,221,787,221,334,222,
            336,222,344,222,787,221,354,354,354,354,
            200,222,354,354
        };
    };
    public final static char baseAction[] = BaseAction.baseAction;
    public final int baseAction(int index) { return baseAction[index]; }
    public final static char lhs[] = baseAction;
    public final int lhs(int index) { return lhs[index]; };

    public interface TermCheck {
        public final static byte termCheck[] = {0,
            0,1,2,3,4,5,6,7,8,9,
            10,11,12,13,14,15,16,17,18,19,
            20,21,22,23,24,25,26,27,28,29,
            30,31,32,33,34,35,36,37,38,39,
            40,41,42,43,44,45,46,47,48,49,
            50,51,52,53,54,55,56,57,58,59,
            60,61,62,63,64,65,66,67,68,69,
            70,71,72,73,74,75,76,77,78,79,
            80,81,82,83,84,85,86,87,88,89,
            90,91,92,93,94,95,96,97,98,0,
            1,2,3,4,5,6,7,8,9,10,
            11,12,13,14,15,16,17,18,19,20,
            21,22,23,24,25,26,27,28,29,30,
            31,32,33,34,35,36,37,38,39,40,
            41,42,43,44,45,46,47,48,49,50,
            51,52,53,54,55,56,57,58,59,60,
            61,62,63,64,65,66,67,68,69,70,
            71,72,73,74,75,76,77,78,79,80,
            81,82,83,84,85,86,87,88,89,90,
            91,92,93,94,95,96,97,98,0,1,
            2,3,4,5,6,7,8,9,10,11,
            12,13,14,15,16,17,18,19,20,21,
            22,23,24,25,26,27,28,29,30,31,
            32,33,34,35,36,37,38,39,40,41,
            42,43,44,45,46,47,48,49,50,51,
            52,53,54,55,56,57,58,59,60,61,
            62,63,64,65,66,67,68,69,70,71,
            72,73,74,75,76,77,78,79,80,81,
            82,83,84,85,86,87,88,89,90,91,
            92,93,94,95,96,0,0,99,0,1,
            2,3,4,5,6,7,8,9,10,11,
            12,13,14,15,16,17,18,19,20,21,
            22,23,24,25,26,27,28,29,30,31,
            32,33,34,35,36,37,38,39,40,41,
            42,43,44,45,46,47,48,49,50,51,
            52,53,54,55,56,57,58,59,60,61,
            62,63,64,65,66,67,68,69,70,71,
            72,0,0,75,76,77,78,79,80,81,
            82,83,84,85,86,87,88,0,0,91,
            92,93,94,95,96,0,1,2,3,4,
            5,6,7,8,9,10,11,12,13,14,
            15,16,17,18,19,20,21,22,23,24,
            25,26,27,28,29,30,31,32,33,34,
            35,36,37,38,39,40,41,42,43,44,
            45,46,47,48,49,50,51,52,53,54,
            55,56,57,58,59,60,61,62,63,64,
            65,66,67,68,69,70,71,72,0,0,
            75,76,77,78,79,80,81,82,83,84,
            85,86,87,88,0,0,91,92,93,94,
            95,96,0,1,2,3,4,5,6,7,
            8,9,10,11,12,13,14,15,16,17,
            18,19,20,21,22,23,24,25,26,27,
            28,29,30,31,32,33,34,35,36,37,
            38,39,40,41,42,43,44,45,46,47,
            48,49,50,51,52,53,54,55,56,57,
            58,59,60,61,62,63,64,65,66,67,
            68,69,70,71,72,73,74,75,76,100,
            78,79,80,81,82,83,84,85,86,87,
            88,89,90,0,0,0,0,0,0,97,
            98,0,1,2,3,4,5,6,7,8,
            9,10,11,12,13,14,15,16,17,18,
            19,20,21,22,23,24,25,26,0,28,
            29,30,31,32,33,34,35,36,37,38,
            39,40,41,42,43,44,45,46,47,48,
            49,50,51,52,53,54,55,56,57,58,
            59,60,61,62,63,64,0,1,2,3,
            4,5,6,7,8,9,10,11,12,13,
            14,15,16,17,18,19,20,21,22,23,
            24,25,26,0,28,29,30,31,32,33,
            34,35,36,37,38,39,40,41,42,43,
            44,45,46,47,48,49,50,51,52,53,
            54,55,56,57,58,59,60,61,62,63,
            64,0,1,2,3,4,5,6,7,8,
            9,10,11,12,13,14,15,16,17,18,
            19,20,21,22,23,24,25,26,0,28,
            29,30,31,32,33,34,35,36,37,38,
            39,40,41,42,43,44,45,46,47,48,
            49,50,51,52,53,54,55,56,57,58,
            59,60,61,62,63,64,0,1,2,3,
            4,5,6,7,8,9,10,11,12,13,
            14,15,16,0,0,0,0,21,22,23,
            24,25,26,0,1,2,3,4,5,6,
            7,8,9,10,0,1,2,3,4,5,
            6,7,8,9,10,0,0,0,0,0,
            0,0,0,0,0,0,11,12,0,0,
            0,0,17,18,19,20,0,0,0,0,
            0,0,0,27,27,27,27,0,65,0,
            0,0,66,68,0,71,72,0,0,0,
            0,0,69,0,0,0,0,0,0,0,
            0,0,89,90,0,0,0,0,0,0,
            97,98,0,0,0,0,0,67,73,74,
            0,70,77,0,0,73,0,74,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0
        };
    };
    public final static byte termCheck[] = TermCheck.termCheck;
    public final int termCheck(int index) { return termCheck[index]; }

    public interface TermAction {
        public final static char termAction[] = {0,
            354,452,453,454,455,456,457,458,459,460,
            461,401,405,400,402,403,404,413,417,419,
            420,426,427,428,429,430,431,495,406,407,
            408,409,410,411,412,414,415,416,418,421,
            422,423,424,425,399,432,433,434,435,436,
            437,438,439,440,441,442,443,444,445,446,
            447,448,449,450,451,462,485,479,481,492,
            494,513,516,473,483,474,482,484,486,487,
            488,489,490,491,493,469,470,471,472,465,
            466,478,475,476,477,496,480,463,464,354,
            452,453,454,455,456,457,458,459,460,461,
            401,405,400,402,403,404,413,417,419,420,
            426,427,428,429,430,431,495,406,407,408,
            409,410,411,412,414,415,416,418,421,422,
            423,424,425,399,432,433,434,435,436,437,
            438,439,440,441,442,443,444,445,446,447,
            448,449,450,451,462,485,479,481,492,494,
            389,517,473,483,474,482,484,486,487,488,
            489,490,491,493,469,470,471,472,465,466,
            478,475,476,477,496,480,463,464,36,452,
            453,454,455,456,457,458,459,460,461,401,
            405,400,402,403,404,413,417,419,420,426,
            427,428,429,430,431,495,406,407,408,409,
            410,411,412,414,415,416,418,421,422,423,
            424,425,399,432,433,434,435,436,437,438,
            439,440,441,442,443,444,445,446,447,448,
            449,450,451,501,485,479,481,492,494,503,
            502,473,483,474,482,484,486,487,488,489,
            490,491,493,469,470,471,472,505,506,478,
            475,476,477,496,480,161,354,507,166,452,
            453,454,455,456,457,458,459,460,461,401,
            405,400,402,403,404,413,417,419,420,426,
            427,428,429,430,431,547,406,407,408,409,
            410,411,412,414,415,416,418,421,422,423,
            424,425,399,432,433,434,435,436,437,438,
            439,440,441,442,443,444,445,446,447,448,
            449,450,451,552,537,533,535,544,546,524,
            527,354,354,528,536,288,538,539,540,541,
            542,543,545,522,523,525,526,354,354,532,
            529,530,531,548,534,167,452,453,454,455,
            456,457,458,459,460,461,401,405,400,402,
            403,404,413,417,419,420,426,427,428,429,
            430,431,547,406,407,408,409,410,411,412,
            414,415,416,418,421,422,423,424,425,399,
            432,433,434,435,436,437,438,439,440,441,
            442,443,444,445,446,447,448,449,450,451,
            552,537,533,535,544,546,524,527,354,354,
            528,536,288,538,539,540,541,542,543,545,
            522,523,525,526,354,354,532,529,530,531,
            548,534,354,452,453,454,455,456,457,458,
            459,460,461,401,405,400,402,403,404,413,
            417,419,420,426,427,428,429,430,431,244,
            406,407,408,409,410,411,412,414,415,416,
            418,421,422,423,424,425,399,432,433,434,
            435,436,437,438,439,440,441,442,443,444,
            445,446,447,448,449,450,451,462,271,272,
            237,385,269,278,363,247,264,270,577,353,
            378,379,376,377,387,382,255,361,276,368,
            369,465,466,354,354,354,354,354,354,463,
            464,1,452,453,454,455,456,457,458,459,
            460,461,401,405,400,402,403,404,413,417,
            419,420,426,427,428,429,430,431,354,406,
            407,408,409,410,411,412,414,415,416,418,
            421,422,423,424,425,399,432,433,434,435,
            436,437,438,439,440,441,442,443,444,445,
            446,447,448,449,450,451,354,452,453,454,
            455,456,457,458,459,460,461,401,405,400,
            402,403,404,413,417,419,420,426,427,428,
            429,430,431,354,406,407,408,409,410,411,
            412,414,415,416,418,421,422,423,424,425,
            399,432,433,434,435,436,437,438,439,440,
            441,442,443,444,445,446,447,448,449,450,
            451,5,452,453,454,455,456,457,458,459,
            460,461,401,405,400,402,403,404,413,417,
            419,420,426,427,428,429,430,431,354,406,
            407,408,409,410,411,412,414,415,416,418,
            421,422,423,424,425,399,432,433,434,435,
            436,437,438,439,440,441,442,443,444,445,
            446,447,448,449,450,451,354,452,453,454,
            455,456,457,458,459,460,461,564,568,563,
            565,566,567,34,10,29,27,569,570,571,
            572,573,574,4,452,453,454,455,456,457,
            458,459,460,461,39,452,453,454,455,456,
            457,458,459,460,461,354,32,17,16,13,
            354,8,354,354,354,354,555,558,354,354,
            354,354,557,559,556,332,354,354,354,354,
            354,354,354,372,374,373,375,354,462,354,
            354,354,366,384,354,497,259,354,354,354,
            354,354,312,354,354,354,354,354,354,354,
            354,354,465,466,354,354,354,354,354,354,
            463,464,354,354,354,354,354,365,560,561,
            354,380,562,354,354,357,354,356
        };
    };
    public final static char termAction[] = TermAction.termAction;
    public final int termAction(int index) { return termAction[index]; }
    public final int asb(int index) { return 0; }
    public final int asr(int index) { return 0; }
    public final int nasb(int index) { return 0; }
    public final int nasr(int index) { return 0; }
    public final int terminalIndex(int index) { return 0; }
    public final int nonterminalIndex(int index) { return 0; }
    public final int scopePrefix(int index) { return 0;}
    public final int scopeSuffix(int index) { return 0;}
    public final int scopeLhs(int index) { return 0;}
    public final int scopeLa(int index) { return 0;}
    public final int scopeStateSet(int index) { return 0;}
    public final int scopeRhs(int index) { return 0;}
    public final int scopeState(int index) { return 0;}
    public final int inSymb(int index) { return 0;}
    public final String name(int index) { return null; }
    public final int getErrorSymbol() { return 0; }
    public final int getScopeUbound() { return 0; }
    public final int getScopeSize() { return 0; }
    public final int getMaxNameLength() { return 0; }

    public final static int
           NUM_STATES        = 31,
           NT_OFFSET         = 103,
           LA_STATE_OFFSET   = 577,
           MAX_LA            = 1,
           NUM_RULES         = 223,
           NUM_NONTERMINALS  = 24,
           NUM_SYMBOLS       = 127,
           SEGMENT_SIZE      = 8192,
           START_STATE       = 224,
           IDENTIFIER_SYMBOL = 0,
           EOFT_SYMBOL       = 100,
           EOLT_SYMBOL       = 104,
           ACCEPT_ACTION     = 353,
           ERROR_ACTION      = 354;

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

    public final int originalState(int state) { return 0; }
    public final int asi(int state) { return 0; }
    public final int nasi(int state) { return 0; }
    public final int inSymbol(int state) { return 0; }

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


//----------------------------------------------------
// The following code was generated by CUP v0.10k
// Tue May 20 23:06:04 CST 2022
//----------------------------------------------------

package Codigo3Direcciones;

import java_cup.runtime.Symbol;

/** CUP v0.10k generated Producciones.
  * @version Tue May 20 23:06:04 CST 2022
  */
public class Producciones extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public Producciones() {super();}

  /** Constructor which sets the default scanner. */
  public Producciones(java_cup.runtime.Scanner s) {super(s);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\031\000\002\002\004\000\002\035\002\000\002\030" +
    "\004\000\002\031\003\000\002\032\005\000\002\032\005" +
    "\000\002\032\004\000\002\032\003\000\002\033\005\000" +
    "\002\033\005\000\002\033\005\000\002\033\005\000\002" +
    "\033\005\000\002\033\005\000\002\033\003\000\002\034" +
    "\005\000\002\034\005\000\002\034\005\000\002\034\005" +
    "\000\002\034\005\000\002\034\004\000\002\034\005\000" +
    "\002\034\003\000\002\034\003\000\002\034\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\054\000\016\043\000\056\000\057\000\061\000\062" +
    "\000\063\000\001\002\000\004\002\056\001\002\000\016" +
    "\043\007\056\015\057\017\061\016\062\006\063\011\001" +
    "\002\000\040\002\uffea\040\uffea\041\uffea\042\uffea\043\uffea" +
    "\044\uffea\045\uffea\047\uffea\050\uffea\051\uffea\052\uffea\053" +
    "\uffea\054\uffea\055\uffea\060\uffea\001\002\000\014\043\007" +
    "\057\017\061\016\062\006\063\011\001\002\000\010\002" +
    "\ufffe\054\021\055\023\001\002\000\040\002\uffe9\040\uffe9" +
    "\041\uffe9\042\uffe9\043\uffe9\044\uffe9\045\uffe9\047\uffe9\050" +
    "\uffe9\051\uffe9\052\uffe9\053\uffe9\054\uffe9\055\uffe9\060\uffe9" +
    "\001\002\000\004\002\uffff\001\002\000\012\002\ufffa\054" +
    "\ufffa\055\ufffa\060\ufffa\001\002\000\040\002\ufff3\040\032" +
    "\041\033\042\036\043\030\044\034\045\041\047\031\050" +
    "\037\051\027\052\035\053\040\054\ufff3\055\ufff3\060\ufff3" +
    "\001\002\000\016\043\007\056\015\057\017\061\016\062" +
    "\006\063\011\001\002\000\040\002\uffeb\040\uffeb\041\uffeb" +
    "\042\uffeb\043\uffeb\044\uffeb\045\uffeb\047\uffeb\050\uffeb\051" +
    "\uffeb\052\uffeb\053\uffeb\054\uffeb\055\uffeb\060\uffeb\001\002" +
    "\000\016\043\007\056\015\057\017\061\016\062\006\063" +
    "\011\001\002\000\010\054\021\055\023\060\022\001\002" +
    "\000\016\043\007\056\015\057\017\061\016\062\006\063" +
    "\011\001\002\000\040\002\uffec\040\uffec\041\uffec\042\uffec" +
    "\043\uffec\044\uffec\045\uffec\047\uffec\050\uffec\051\uffec\052" +
    "\uffec\053\uffec\054\uffec\055\uffec\060\uffec\001\002\000\016" +
    "\043\007\056\015\057\017\061\016\062\006\063\011\001" +
    "\002\000\012\002\ufffc\054\ufffc\055\ufffc\060\ufffc\001\002" +
    "\000\012\002\ufffd\054\ufffd\055\ufffd\060\ufffd\001\002\000" +
    "\012\002\ufffb\054\021\055\023\060\ufffb\001\002\000\014" +
    "\043\007\057\017\061\016\062\006\063\011\001\002\000" +
    "\014\043\007\057\017\061\016\062\006\063\011\001\002" +
    "\000\014\043\007\057\017\061\016\062\006\063\011\001" +
    "\002\000\014\043\007\057\017\061\016\062\006\063\011" +
    "\001\002\000\014\043\007\057\017\061\016\062\006\063" +
    "\011\001\002\000\014\043\007\057\017\061\016\062\006" +
    "\063\011\001\002\000\014\043\007\057\017\061\016\062" +
    "\006\063\011\001\002\000\014\043\007\057\017\061\016" +
    "\062\006\063\011\001\002\000\014\043\007\057\017\061" +
    "\016\062\006\063\011\001\002\000\014\043\007\057\017" +
    "\061\016\062\006\063\011\001\002\000\014\043\007\057" +
    "\017\061\016\062\006\063\011\001\002\000\040\002\uffef" +
    "\040\032\041\uffef\042\uffef\043\uffef\044\uffef\045\uffef\047" +
    "\uffef\050\uffef\051\uffef\052\uffef\053\uffef\054\uffef\055\uffef" +
    "\060\uffef\001\002\000\024\002\ufff9\040\032\042\036\043" +
    "\030\044\034\045\041\054\ufff9\055\ufff9\060\ufff9\001\002" +
    "\000\024\002\ufff7\040\032\042\036\043\030\044\034\045" +
    "\041\054\ufff7\055\ufff7\060\ufff7\001\002\000\040\002\ufff2" +
    "\040\032\041\ufff2\042\ufff2\043\ufff2\044\034\045\041\047" +
    "\ufff2\050\ufff2\051\ufff2\052\ufff2\053\ufff2\054\ufff2\055\ufff2" +
    "\060\ufff2\001\002\000\024\002\ufff5\040\032\042\036\043" +
    "\030\044\034\045\041\054\ufff5\055\ufff5\060\ufff5\001\002" +
    "\000\040\002\ufff0\040\032\041\ufff0\042\ufff0\043\ufff0\044" +
    "\ufff0\045\ufff0\047\ufff0\050\ufff0\051\ufff0\052\ufff0\053\ufff0" +
    "\054\ufff0\055\ufff0\060\ufff0\001\002\000\024\002\ufff8\040" +
    "\032\042\036\043\030\044\034\045\041\054\ufff8\055\ufff8" +
    "\060\ufff8\001\002\000\040\002\uffee\040\032\041\uffee\042" +
    "\uffee\043\uffee\044\uffee\045\uffee\047\uffee\050\uffee\051\uffee" +
    "\052\uffee\053\uffee\054\uffee\055\uffee\060\uffee\001\002\000" +
    "\024\002\ufff6\040\032\042\036\043\030\044\034\045\041" +
    "\054\ufff6\055\ufff6\060\ufff6\001\002\000\040\002\ufff1\040" +
    "\032\041\ufff1\042\ufff1\043\ufff1\044\034\045\041\047\ufff1" +
    "\050\ufff1\051\ufff1\052\ufff1\053\ufff1\054\ufff1\055\ufff1\060" +
    "\ufff1\001\002\000\024\002\ufff4\040\032\042\036\043\030" +
    "\044\034\045\041\054\ufff4\055\ufff4\060\ufff4\001\002\000" +
    "\040\002\uffed\040\032\041\uffed\042\uffed\043\uffed\044\034" +
    "\045\041\047\uffed\050\uffed\051\uffed\052\uffed\053\uffed\054" +
    "\uffed\055\uffed\060\uffed\001\002\000\004\002\001\001\002" +
    "" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\054\000\006\030\003\035\004\001\001\000\002\001" +
    "\001\000\012\031\011\032\007\033\012\034\013\001\001" +
    "\000\002\001\001\000\004\034\054\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\010\032\025\033\012\034\013\001" +
    "\001\000\002\001\001\000\010\032\017\033\012\034\013" +
    "\001\001\000\002\001\001\000\010\032\024\033\012\034" +
    "\013\001\001\000\002\001\001\000\010\032\023\033\012" +
    "\034\013\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\004\034\053\001\001\000\004\034\052" +
    "\001\001\000\004\034\051\001\001\000\004\034\050\001" +
    "\001\000\004\034\047\001\001\000\004\034\046\001\001" +
    "\000\004\034\045\001\001\000\004\034\044\001\001\000" +
    "\004\034\043\001\001\000\004\034\042\001\001\000\004" +
    "\034\041\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



	public static void main(String args[]) throws Exception{
		new Producciones(new Yylex(System.in)).parse();
	}
	
	 public void syntax_error(Symbol s){ 
        System.out.println("Error Sintáctico en la Línea " + (s.left + 1) +
        " Posicion "+s.right+ ". No se esperaba este componente: " +s.value+"."); 
    } 

    /**
     * Método al que se llama automáticamente ante algún error sintáctico 
     * en el que ya no es posible una recuperación de errores.
     **/ 
    public void unrecovered_syntax_error(Symbol s) { 
        System.out.println("Error síntactico irrecuperable en la Línea " + 
        (s.left+ 1)+ " Posicion "+s.right+". Componente " + s.value + 
        " no reconocido."); 
    }  
	

}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$parser$actions {
  private final Producciones parser;

  /** Constructor */
  CUP$parser$actions(Producciones parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$parser$do_action(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$parser$result;

      /* select the action based on the action number */
      switch (CUP$parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // expresion ::= DIGITODECIMAL 
            {
              NodoCodigo3Dir RESULT = null;
		int digitodecimalleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left;
		int digitodecimalright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right;
		String digitodecimal = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-0)).value;
		 RESULT = new NodoCodigo3Dir(digitodecimal); 
              CUP$parser$result = new java_cup.runtime.Symbol(26/*expresion*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // expresion ::= DIGITO 
            {
              NodoCodigo3Dir RESULT = null;
		int digitoleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left;
		int digitoright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right;
		String digito = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-0)).value;
		 RESULT = new NodoCodigo3Dir(digito); 
              CUP$parser$result = new java_cup.runtime.Symbol(26/*expresion*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // expresion ::= IDENTIFICADOR 
            {
              NodoCodigo3Dir RESULT = null;
		int identificadorleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left;
		int identificadorright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right;
		String identificador = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-0)).value;
		 RESULT = new NodoCodigo3Dir(identificador); 
              CUP$parser$result = new java_cup.runtime.Symbol(26/*expresion*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // expresion ::= PI logico PD 
            {
              NodoCodigo3Dir RESULT = null;
		int expleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int expright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		NodoCodigo3Dir exp = (NodoCodigo3Dir)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 RESULT = exp; 
              CUP$parser$result = new java_cup.runtime.Symbol(26/*expresion*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // expresion ::= MENOS expresion 
            {
              NodoCodigo3Dir RESULT = null;
		int expleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left;
		int expright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right;
		NodoCodigo3Dir exp = (NodoCodigo3Dir)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-0)).value;
		 
                        String temp = CtrlCodigo3Dir.generaTemp();
                        String c3d = temp + " = - " + exp.getCad() + ";\n";
                        CtrlCodigo3Dir.agregarC3D(c3d);
                        RESULT = new NodoCodigo3Dir(temp); 
                    
              CUP$parser$result = new java_cup.runtime.Symbol(26/*expresion*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // expresion ::= expresion POT expresion 
            {
              NodoCodigo3Dir RESULT = null;
		int izqleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int izqright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		NodoCodigo3Dir izq = (NodoCodigo3Dir)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int derleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left;
		int derright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right;
		NodoCodigo3Dir der = (NodoCodigo3Dir)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-0)).value;
		 
                        String temp = CtrlCodigo3Dir.generaTemp();
                        String c3d = temp + " = " + izq.getCad() + " ^ " + der.getCad() + ";\n";
                        CtrlCodigo3Dir.agregarC3D(c3d);
                        RESULT = new NodoCodigo3Dir(temp); 
                    
              CUP$parser$result = new java_cup.runtime.Symbol(26/*expresion*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // expresion ::= expresion DIVISION expresion 
            {
              NodoCodigo3Dir RESULT = null;
		int izqleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int izqright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		NodoCodigo3Dir izq = (NodoCodigo3Dir)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int derleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left;
		int derright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right;
		NodoCodigo3Dir der = (NodoCodigo3Dir)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-0)).value;
		 
                        String temp = CtrlCodigo3Dir.generaTemp();
                        String c3d = temp + " = " + izq.getCad() + " / " + der.getCad() + ";\n";
                        CtrlCodigo3Dir.agregarC3D(c3d);
                        RESULT = new NodoCodigo3Dir(temp); 
                    
              CUP$parser$result = new java_cup.runtime.Symbol(26/*expresion*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // expresion ::= expresion MULTIPLICACION expresion 
            {
              NodoCodigo3Dir RESULT = null;
		int izqleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int izqright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		NodoCodigo3Dir izq = (NodoCodigo3Dir)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int derleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left;
		int derright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right;
		NodoCodigo3Dir der = (NodoCodigo3Dir)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-0)).value;
		 
                        String temp = CtrlCodigo3Dir.generaTemp();
                        String c3d = temp + " = " + izq.getCad() + " * " + der.getCad() + ";\n";
                        CtrlCodigo3Dir.agregarC3D(c3d);
                        RESULT = new NodoCodigo3Dir(temp); 
                    
              CUP$parser$result = new java_cup.runtime.Symbol(26/*expresion*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // expresion ::= expresion MENOS expresion 
            {
              NodoCodigo3Dir RESULT = null;
		int izqleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int izqright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		NodoCodigo3Dir izq = (NodoCodigo3Dir)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int derleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left;
		int derright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right;
		NodoCodigo3Dir der = (NodoCodigo3Dir)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-0)).value;
		 
                        String temp = CtrlCodigo3Dir.generaTemp();
                        String c3d = temp + " = " + izq.getCad() + " - " + der.getCad() + ";\n";
                        CtrlCodigo3Dir.agregarC3D(c3d);
                        RESULT = new NodoCodigo3Dir(temp); 
                    
              CUP$parser$result = new java_cup.runtime.Symbol(26/*expresion*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // expresion ::= expresion MAS expresion 
            {
              NodoCodigo3Dir RESULT = null;
		int izqleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int izqright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		NodoCodigo3Dir izq = (NodoCodigo3Dir)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int derleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left;
		int derright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right;
		NodoCodigo3Dir der = (NodoCodigo3Dir)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-0)).value;
		 
                        String temp = CtrlCodigo3Dir.generaTemp();
                        String c3d = temp + " = " + izq.getCad() + " + " + der.getCad() + ";\n";
                        CtrlCodigo3Dir.agregarC3D(c3d);
                        RESULT = new NodoCodigo3Dir(temp); 
                    
              CUP$parser$result = new java_cup.runtime.Symbol(26/*expresion*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // relacional ::= expresion 
            {
              NodoCodigo3Dir RESULT = null;
		int expleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left;
		int expright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right;
		NodoCodigo3Dir exp = (NodoCodigo3Dir)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-0)).value;
		RESULT = exp;
              CUP$parser$result = new java_cup.runtime.Symbol(25/*relacional*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // relacional ::= expresion MENORIGUAL expresion 
            {
              NodoCodigo3Dir RESULT = null;
		int izqleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int izqright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		NodoCodigo3Dir izq = (NodoCodigo3Dir)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int derleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left;
		int derright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right;
		NodoCodigo3Dir der = (NodoCodigo3Dir)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-0)).value;
		 
                        String temp = CtrlCodigo3Dir.generaTemp();
                        String c3d = temp + " = " + izq.getCad() + " <= " + der.getCad() + ";\n";
                        CtrlCodigo3Dir.agregarC3D(c3d);
                        RESULT = new NodoCodigo3Dir(temp); 
                    
              CUP$parser$result = new java_cup.runtime.Symbol(25/*relacional*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // relacional ::= expresion MAYORIGUAL expresion 
            {
              NodoCodigo3Dir RESULT = null;
		int izqleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int izqright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		NodoCodigo3Dir izq = (NodoCodigo3Dir)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int derleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left;
		int derright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right;
		NodoCodigo3Dir der = (NodoCodigo3Dir)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-0)).value;
		 
                        String temp = CtrlCodigo3Dir.generaTemp();
                        String c3d = temp + " = " + izq.getCad() + " >= " + der.getCad() + ";\n";
                        CtrlCodigo3Dir.agregarC3D(c3d);
                        RESULT = new NodoCodigo3Dir(temp); 
                    
              CUP$parser$result = new java_cup.runtime.Symbol(25/*relacional*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // relacional ::= expresion MENOR expresion 
            {
              NodoCodigo3Dir RESULT = null;
		int izqleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int izqright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		NodoCodigo3Dir izq = (NodoCodigo3Dir)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int derleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left;
		int derright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right;
		NodoCodigo3Dir der = (NodoCodigo3Dir)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-0)).value;
		 
                        String temp = CtrlCodigo3Dir.generaTemp();
                        String c3d = temp + " = " + izq.getCad() + " < " + der.getCad() + ";\n";
                        CtrlCodigo3Dir.agregarC3D(c3d);
                        RESULT = new NodoCodigo3Dir(temp); 
                    
              CUP$parser$result = new java_cup.runtime.Symbol(25/*relacional*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // relacional ::= expresion MAYOR expresion 
            {
              NodoCodigo3Dir RESULT = null;
		int izqleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int izqright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		NodoCodigo3Dir izq = (NodoCodigo3Dir)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int derleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left;
		int derright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right;
		NodoCodigo3Dir der = (NodoCodigo3Dir)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-0)).value;
		 
                        String temp = CtrlCodigo3Dir.generaTemp();
                        String c3d = temp + " = " + izq.getCad() + " > " + der.getCad() + ";\n";
                        CtrlCodigo3Dir.agregarC3D(c3d);
                        RESULT = new NodoCodigo3Dir(temp); 
                    
              CUP$parser$result = new java_cup.runtime.Symbol(25/*relacional*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // relacional ::= expresion DIF expresion 
            {
              NodoCodigo3Dir RESULT = null;
		int izqleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int izqright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		NodoCodigo3Dir izq = (NodoCodigo3Dir)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int derleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left;
		int derright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right;
		NodoCodigo3Dir der = (NodoCodigo3Dir)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-0)).value;
		 
                        String temp = CtrlCodigo3Dir.generaTemp();
                        String c3d = temp + " = " + izq.getCad() + " != " + der.getCad() + ";\n";
                        CtrlCodigo3Dir.agregarC3D(c3d);
                        RESULT = new NodoCodigo3Dir(temp); 
                    
              CUP$parser$result = new java_cup.runtime.Symbol(25/*relacional*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // relacional ::= expresion IGUAL expresion 
            {
              NodoCodigo3Dir RESULT = null;
		int izqleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int izqright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		NodoCodigo3Dir izq = (NodoCodigo3Dir)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int derleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left;
		int derright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right;
		NodoCodigo3Dir der = (NodoCodigo3Dir)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-0)).value;
		 
                        String temp = CtrlCodigo3Dir.generaTemp();
                        String c3d = temp + " = " + izq.getCad() + " == " + der.getCad() + ";\n";
                        CtrlCodigo3Dir.agregarC3D(c3d);
                        RESULT = new NodoCodigo3Dir(temp); 
                    
              CUP$parser$result = new java_cup.runtime.Symbol(25/*relacional*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // logico ::= relacional 
            {
              NodoCodigo3Dir RESULT = null;
		int relleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left;
		int relright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right;
		NodoCodigo3Dir rel = (NodoCodigo3Dir)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-0)).value;
		RESULT = rel;
              CUP$parser$result = new java_cup.runtime.Symbol(24/*logico*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // logico ::= NOT logico 
            {
              NodoCodigo3Dir RESULT = null;
		int derleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left;
		int derright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right;
		NodoCodigo3Dir der = (NodoCodigo3Dir)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-0)).value;
		 
                        String temp = CtrlCodigo3Dir.generaTemp();
                        String c3d = temp + " =  " + " ! " + der.getCad() + ";\n";
                        CtrlCodigo3Dir.agregarC3D(c3d);
                        RESULT = new NodoCodigo3Dir(temp); 
                    
              CUP$parser$result = new java_cup.runtime.Symbol(24/*logico*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // logico ::= logico OR logico 
            {
              NodoCodigo3Dir RESULT = null;
		int izqleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int izqright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		NodoCodigo3Dir izq = (NodoCodigo3Dir)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int derleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left;
		int derright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right;
		NodoCodigo3Dir der = (NodoCodigo3Dir)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-0)).value;
		 
                        String temp = CtrlCodigo3Dir.generaTemp();
                        String c3d = temp + " = " + izq.getCad() + " || " + der.getCad() + ";\n";
                        CtrlCodigo3Dir.agregarC3D(c3d);
                        RESULT = new NodoCodigo3Dir(temp); 
                    
              CUP$parser$result = new java_cup.runtime.Symbol(24/*logico*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // logico ::= logico AND logico 
            {
              NodoCodigo3Dir RESULT = null;
		int izqleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int izqright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		NodoCodigo3Dir izq = (NodoCodigo3Dir)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int derleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left;
		int derright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right;
		NodoCodigo3Dir der = (NodoCodigo3Dir)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-0)).value;
		 
                        String temp = CtrlCodigo3Dir.generaTemp();
                        String c3d = temp + " = " + izq.getCad() + " && " + der.getCad() + ";\n";
                        CtrlCodigo3Dir.agregarC3D(c3d);
                        RESULT = new NodoCodigo3Dir(temp); 
                    
              CUP$parser$result = new java_cup.runtime.Symbol(24/*logico*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // inicio ::= logico 
            {
              NodoCodigo3Dir RESULT = null;
		int logleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left;
		int logright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right;
		NodoCodigo3Dir log = (NodoCodigo3Dir)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-0)).value;
		RESULT = log;
              CUP$parser$result = new java_cup.runtime.Symbol(23/*inicio*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // ini ::= NT$0 inicio 
            {
              NodoCodigo3Dir RESULT = null;
              // propagate RESULT from NT$0
              if ( ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value != null )
                RESULT = (NodoCodigo3Dir) ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int expleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left;
		int expright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right;
		NodoCodigo3Dir exp = (NodoCodigo3Dir)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-0)).value;
		 
                        RESULT = exp;
                        CtrlCodigo3Dir.agregarC3D("//Ultimo valor: " + exp.getCad());
                    
              CUP$parser$result = new java_cup.runtime.Symbol(22/*ini*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // NT$0 ::= 
            {
              Object RESULT = null;
 CtrlCodigo3Dir.reiniciar(); 
              CUP$parser$result = new java_cup.runtime.Symbol(27/*NT$0*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= ini EOF 
            {
              Object RESULT = null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		NodoCodigo3Dir start_val = (NodoCodigo3Dir)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = start_val;
              CUP$parser$result = new java_cup.runtime.Symbol(0/*$START*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          /* ACCEPT */
          CUP$parser$parser.done_parsing();
          return CUP$parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}


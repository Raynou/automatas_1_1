
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

package itcm;

import java_cup.runtime.*;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class Syntax extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return syn.class;
}

  /** Default constructor. */
  @Deprecated
  public Syntax() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public Syntax(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public Syntax(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\073\000\002\002\004\000\002\013\003\000\002\013" +
    "\003\000\002\013\003\000\002\023\003\000\002\023\003" +
    "\000\002\023\003\000\002\023\003\000\002\023\003\000" +
    "\002\026\003\000\002\026\003\000\002\026\003\000\002" +
    "\026\003\000\002\026\003\000\002\026\003\000\002\024" +
    "\003\000\002\024\003\000\002\024\003\000\002\036\004" +
    "\000\002\025\003\000\002\025\003\000\002\002\006\000" +
    "\002\002\003\000\002\017\004\000\002\017\002\000\002" +
    "\012\005\000\002\037\003\000\002\037\003\000\002\022" +
    "\004\000\002\022\002\000\002\014\003\000\002\014\002" +
    "\000\002\031\005\000\002\030\007\000\002\015\005\000" +
    "\002\003\006\000\002\027\004\000\002\020\004\000\002" +
    "\020\002\000\002\005\004\000\002\007\004\000\002\010" +
    "\003\000\002\010\003\000\002\010\003\000\002\010\003" +
    "\000\002\004\003\000\002\004\003\000\002\011\003\000" +
    "\002\011\003\000\002\011\003\000\002\006\006\000\002" +
    "\021\004\000\002\021\002\000\002\035\006\000\002\040" +
    "\004\000\002\040\002\000\002\034\012\000\002\032\007" +
    "\000\002\033\005" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\142\000\004\044\005\001\002\000\004\002\144\001" +
    "\002\000\004\053\006\001\002\000\004\007\007\001\002" +
    "\000\006\011\010\040\uffe4\001\002\000\004\040\140\001" +
    "\002\000\004\040\140\001\002\000\004\010\013\001\002" +
    "\000\004\036\014\001\002\000\004\040\015\001\002\000" +
    "\004\005\016\001\002\000\020\040\020\041\030\042\021" +
    "\043\026\045\034\050\031\053\037\001\002\000\004\002" +
    "\uffc9\001\002\000\004\053\037\001\002\000\010\051\050" +
    "\052\043\053\045\001\002\000\022\006\uffd3\040\uffd3\041" +
    "\uffd3\042\uffd3\043\uffd3\045\uffd3\050\uffd3\053\uffd3\001\002" +
    "\000\022\006\uffd8\040\uffd8\041\uffd8\042\uffd8\043\uffd8\045" +
    "\uffd8\050\uffd8\053\uffd8\001\002\000\022\006\uffd5\040\uffd5" +
    "\041\uffd5\042\uffd5\043\uffd5\045\uffd5\050\uffd5\053\uffd5\001" +
    "\002\000\022\006\uffd2\040\uffd2\041\uffd2\042\uffd2\043\uffd2" +
    "\045\uffd2\050\uffd2\053\uffd2\001\002\000\010\051\050\052" +
    "\043\053\045\001\002\000\022\006\uffd7\040\uffd7\041\uffd7" +
    "\042\uffd7\043\uffd7\045\uffd7\050\uffd7\053\uffd7\001\002\000" +
    "\010\051\050\052\043\053\045\001\002\000\004\007\073" +
    "\001\002\000\022\006\uffd1\040\uffd1\041\uffd1\042\uffd1\043" +
    "\uffd1\045\uffd1\050\uffd1\053\uffd1\001\002\000\022\006\uffd4" +
    "\040\uffd4\041\uffd4\042\uffd4\043\uffd4\045\uffd4\050\uffd4\053" +
    "\uffd4\001\002\000\012\051\050\052\043\053\045\054\044" +
    "\001\002\000\022\006\uffd0\040\uffd0\041\uffd0\042\uffd0\043" +
    "\uffd0\045\uffd0\050\uffd0\053\uffd0\001\002\000\022\006\uffcd" +
    "\040\020\041\030\042\021\043\026\045\034\050\031\053" +
    "\037\001\002\000\004\037\041\001\002\000\022\006\uffd6" +
    "\040\uffd6\041\uffd6\042\uffd6\043\uffd6\045\uffd6\050\uffd6\053" +
    "\uffd6\001\002\000\012\051\050\052\043\053\045\054\044" +
    "\001\002\000\006\004\uffe7\010\uffe7\001\002\000\052\004" +
    "\uffff\005\uffff\010\uffff\012\uffff\013\uffff\014\uffff\015\uffff" +
    "\016\uffff\017\uffff\021\uffff\022\uffff\025\uffff\026\uffff\027" +
    "\uffff\030\uffff\031\uffff\032\uffff\033\uffff\034\uffff\053\uffff" +
    "\001\002\000\006\004\uffe6\010\uffe6\001\002\000\052\004" +
    "\000\005\000\010\000\012\000\013\000\014\000\015\000" +
    "\016\000\017\000\021\000\022\000\025\000\026\000\027" +
    "\000\030\000\031\000\032\000\033\000\034\000\053\000" +
    "\001\002\000\004\004\064\001\002\000\044\004\uffeb\005" +
    "\uffeb\010\uffeb\012\055\013\054\014\052\015\053\016\056" +
    "\017\051\025\uffeb\026\uffeb\027\uffeb\030\uffeb\031\uffeb\032" +
    "\uffeb\033\uffeb\034\uffeb\001\002\000\052\004\ufffe\005\ufffe" +
    "\010\ufffe\012\ufffe\013\ufffe\014\ufffe\015\ufffe\016\ufffe\017" +
    "\ufffe\021\ufffe\022\ufffe\025\ufffe\026\ufffe\027\ufffe\030\ufffe" +
    "\031\ufffe\032\ufffe\033\ufffe\034\ufffe\053\ufffe\001\002\000" +
    "\010\051\ufff3\052\ufff3\053\ufff3\001\002\000\010\051\ufff6" +
    "\052\ufff6\053\ufff6\001\002\000\010\051\ufff5\052\ufff5\053" +
    "\ufff5\001\002\000\010\051\ufff7\052\ufff7\053\ufff7\001\002" +
    "\000\010\051\ufff8\052\ufff8\053\ufff8\001\002\000\010\051" +
    "\ufff4\052\ufff4\053\ufff4\001\002\000\010\051\050\052\043" +
    "\053\045\001\002\000\044\004\uffe9\005\uffe9\010\uffe9\012" +
    "\055\013\054\014\052\015\053\016\056\017\051\025\uffe9" +
    "\026\uffe9\027\uffe9\030\uffe9\031\uffe9\032\uffe9\033\uffe9\034" +
    "\uffe9\001\002\000\030\004\uffec\005\uffec\010\uffec\025\uffec" +
    "\026\uffec\027\uffec\030\uffec\031\uffec\032\uffec\033\uffec\034" +
    "\uffec\001\002\000\010\051\050\052\043\053\045\001\002" +
    "\000\030\004\uffea\005\uffea\010\uffea\025\uffea\026\uffea\027" +
    "\uffea\030\uffea\031\uffea\032\uffea\033\uffea\034\uffea\001\002" +
    "\000\022\006\uffde\040\uffde\041\uffde\042\uffde\043\uffde\045" +
    "\uffde\050\uffde\053\uffde\001\002\000\004\006\070\001\002" +
    "\000\022\006\uffcd\040\020\041\030\042\021\043\026\045" +
    "\034\050\031\053\037\001\002\000\004\006\uffce\001\002" +
    "\000\026\002\uffcf\006\uffcf\040\uffcf\041\uffcf\042\uffcf\043" +
    "\uffcf\045\uffcf\050\uffcf\053\uffcf\056\uffcf\001\002\000\004" +
    "\004\072\001\002\000\022\006\uffdf\040\uffdf\041\uffdf\042" +
    "\uffdf\043\uffdf\045\uffdf\050\uffdf\053\uffdf\001\002\000\012" +
    "\051\050\052\043\053\045\054\044\001\002\000\004\010" +
    "\075\001\002\000\004\004\076\001\002\000\022\006\uffe0" +
    "\040\uffe0\041\uffe0\042\uffe0\043\uffe0\045\uffe0\050\uffe0\053" +
    "\uffe0\001\002\000\014\030\112\031\114\032\113\033\116" +
    "\034\115\001\002\000\012\005\uffdb\025\103\026\104\027" +
    "\106\001\002\000\004\005\016\001\002\000\022\006\uffc7" +
    "\040\uffc7\041\uffc7\042\uffc7\043\uffc7\045\uffc7\050\uffc7\053" +
    "\uffc7\001\002\000\010\051\ufff2\052\ufff2\053\ufff2\001\002" +
    "\000\010\051\ufff1\052\ufff1\053\ufff1\001\002\000\004\005" +
    "\uffda\001\002\000\010\051\ufff0\052\ufff0\053\ufff0\001\002" +
    "\000\010\051\050\052\043\053\045\001\002\000\004\005" +
    "\uffdc\001\002\000\010\051\050\052\043\053\045\001\002" +
    "\000\010\051\ufffd\052\ufffd\053\ufffd\001\002\000\010\051" +
    "\ufffb\052\ufffb\053\ufffb\001\002\000\010\051\ufffc\052\ufffc" +
    "\053\ufffc\001\002\000\010\051\ufff9\052\ufff9\053\ufff9\001" +
    "\002\000\010\051\ufffa\052\ufffa\053\ufffa\001\002\000\012" +
    "\005\uffe8\025\uffe8\026\uffe8\027\uffe8\001\002\000\004\005" +
    "\016\001\002\000\024\006\uffca\040\uffca\041\uffca\042\uffca" +
    "\043\uffca\045\uffca\050\uffca\053\uffca\056\122\001\002\000" +
    "\004\005\016\001\002\000\022\006\uffcc\040\uffcc\041\uffcc" +
    "\042\uffcc\043\uffcc\045\uffcc\050\uffcc\053\uffcc\001\002\000" +
    "\022\006\uffcb\040\uffcb\041\uffcb\042\uffcb\043\uffcb\045\uffcb" +
    "\050\uffcb\053\uffcb\001\002\000\004\053\133\001\002\000" +
    "\006\021\127\022\131\001\002\000\010\051\uffee\052\uffee" +
    "\053\uffee\001\002\000\010\051\050\052\043\053\045\001" +
    "\002\000\010\051\uffed\052\uffed\053\uffed\001\002\000\004" +
    "\053\uffe1\001\002\000\012\005\uffe2\051\050\052\043\053" +
    "\045\001\002\000\004\005\016\001\002\000\004\005\uffe3" +
    "\001\002\000\022\006\uffc8\040\uffc8\041\uffc8\042\uffc8\043" +
    "\uffc8\045\uffc8\050\uffc8\053\uffc8\001\002\000\022\006\uffd9" +
    "\040\uffd9\041\uffd9\042\uffd9\043\uffd9\045\uffd9\050\uffd9\053" +
    "\uffd9\001\002\000\004\053\142\001\002\000\004\010\uffdd" +
    "\001\002\000\006\010\uffef\040\uffef\001\002\000\004\040" +
    "\uffe5\001\002\000\004\002\001\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\142\000\004\034\003\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\006\022\010\027\011" +
    "\001\001\000\004\036\142\001\001\000\004\036\140\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\004\006\016\001\001\000\026\003\026\004\035\007" +
    "\022\010\032\011\021\015\023\030\037\032\031\033\034" +
    "\035\024\001\001\000\002\001\001\000\004\003\136\001" +
    "\001\000\006\013\125\031\124\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\012\002\076\005\117\012\077\013\046\001\001\000\002" +
    "\001\001\000\012\002\076\005\100\012\077\013\046\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\010\002\041\013\046\037\070\001\001\000\002\001" +
    "\001\000\030\003\026\004\065\007\022\010\032\011\021" +
    "\015\023\021\064\030\037\032\031\033\034\035\024\001" +
    "\001\000\002\001\001\000\002\001\001\000\010\002\041" +
    "\013\046\037\045\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\004\026\056\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\004\013\057\001" +
    "\001\000\006\017\060\026\061\001\001\000\002\001\001" +
    "\000\004\013\062\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\030\003\026\004\065\007\022" +
    "\010\032\011\021\015\023\021\066\030\037\032\031\033" +
    "\034\035\024\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\010\002\041\013" +
    "\046\037\073\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\004\023\110\001\001\000\006\020" +
    "\104\024\106\001\001\000\004\006\101\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\012\002\076\005\107\012\077" +
    "\013\046\001\001\000\002\001\001\000\006\002\116\013" +
    "\046\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\004\006\120\001\001\000\004\040\122\001\001" +
    "\000\004\006\123\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\004\025\127\001\001\000\002" +
    "\001\001\000\004\013\131\001\001\000\002\001\001\000" +
    "\002\001\001\000\006\013\134\014\133\001\001\000\004" +
    "\006\135\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$Syntax$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$Syntax$actions(this);
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
    return action_obj.CUP$Syntax$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



    private Symbol s;

    public void syntax_error(Symbol s){
        this.s = s;
    }

    public Symbol getS(){
        return this.s;
    }


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$Syntax$actions {
  private final Syntax parser;

  /** Constructor */
  CUP$Syntax$actions(Syntax parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$Syntax$do_action_part00000000(
    int                        CUP$Syntax$act_num,
    java_cup.runtime.lr_parser CUP$Syntax$parser,
    java.util.Stack            CUP$Syntax$stack,
    int                        CUP$Syntax$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$Syntax$result;

      /* select the action based on the action number */
      switch (CUP$Syntax$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= RFUN EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$Syntax$stack.elementAt(CUP$Syntax$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$Syntax$stack.elementAt(CUP$Syntax$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$Syntax$stack.elementAt(CUP$Syntax$top-1)).value;
		RESULT = start_val;
              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$Syntax$stack.elementAt(CUP$Syntax$top-1)), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$Syntax$parser.done_parsing();
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // ID_NUM ::= IDENTIFICADOR 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("ID_NUM",9, ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // ID_NUM ::= NUMERO 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("ID_NUM",9, ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // ID_NUM ::= DECIMAL 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("ID_NUM",9, ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // OPERADOR_RELACIONAL ::= MENOR 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("OPERADOR_RELACIONAL",17, ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // OPERADOR_RELACIONAL ::= MAYOR 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("OPERADOR_RELACIONAL",17, ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // OPERADOR_RELACIONAL ::= MENOR_IGUAL 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("OPERADOR_RELACIONAL",17, ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // OPERADOR_RELACIONAL ::= MAYOR_IGUAL 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("OPERADOR_RELACIONAL",17, ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // OPERADOR_RELACIONAL ::= IDENTICO 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("OPERADOR_RELACIONAL",17, ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // OP_ARIT ::= MUL 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("OP_ARIT",20, ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // OP_ARIT ::= POW 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("OP_ARIT",20, ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // OP_ARIT ::= SUM 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("OP_ARIT",20, ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // OP_ARIT ::= SUB 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("OP_ARIT",20, ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // OP_ARIT ::= DIV 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("OP_ARIT",20, ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // OP_ARIT ::= MOD 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("OP_ARIT",20, ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // OPR_LOGICO ::= AND 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("OPR_LOGICO",18, ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // OPR_LOGICO ::= NOT 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("OPR_LOGICO",18, ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // OPR_LOGICO ::= OR 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("OPR_LOGICO",18, ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // TIPOID ::= TIPODEDATO IDENTIFICADOR 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("TIPOID",28, ((java_cup.runtime.Symbol)CUP$Syntax$stack.elementAt(CUP$Syntax$top-1)), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // OPR_RANGO ::= EX_RANGO 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("OPR_RANGO",19, ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // OPR_RANGO ::= IN_RANGO 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("OPR_RANGO",19, ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // ARIT ::= ID_NUM OP_ARIT ID_NUM MAS_ARIT 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("ARIT",0, ((java_cup.runtime.Symbol)CUP$Syntax$stack.elementAt(CUP$Syntax$top-3)), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // ARIT ::= ID_NUM 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("ARIT",0, ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // MAS_ARIT ::= OP_ARIT ID_NUM 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("MAS_ARIT",13, ((java_cup.runtime.Symbol)CUP$Syntax$stack.elementAt(CUP$Syntax$top-1)), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // MAS_ARIT ::= 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("MAS_ARIT",13, ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // EXPR_BOOL ::= ARIT OPERADOR_RELACIONAL ARIT 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("EXPR_BOOL",8, ((java_cup.runtime.Symbol)CUP$Syntax$stack.elementAt(CUP$Syntax$top-2)), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // VALOR ::= ARIT 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("VALOR",29, ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // VALOR ::= TEXTO 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("VALOR",29, ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // MAS_TIPOID ::= COMA TIPOID 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("MAS_TIPOID",16, ((java_cup.runtime.Symbol)CUP$Syntax$stack.elementAt(CUP$Syntax$top-1)), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // MAS_TIPOID ::= 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("MAS_TIPOID",16, ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 30: // INCEXP ::= ID_NUM 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("INCEXP",10, ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 31: // INCEXP ::= 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("INCEXP",10, ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 32: // RANGO ::= ID_NUM OPR_RANGO ID_NUM 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("RANGO",23, ((java_cup.runtime.Symbol)CUP$Syntax$stack.elementAt(CUP$Syntax$top-2)), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 33: // RPRINT ::= PRINT I_PAR VALOR D_PAR P_COMA 
            {
              Object RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Syntax$stack.elementAt(CUP$Syntax$top-2)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Syntax$stack.elementAt(CUP$Syntax$top-2)).right;
		Object a = (Object)((java_cup.runtime.Symbol) CUP$Syntax$stack.elementAt(CUP$Syntax$top-2)).value;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("RPRINT",22, ((java_cup.runtime.Symbol)CUP$Syntax$stack.elementAt(CUP$Syntax$top-4)), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 34: // RRETURN ::= RETURN VALOR P_COMA 
            {
              Object RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Syntax$stack.elementAt(CUP$Syntax$top-1)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Syntax$stack.elementAt(CUP$Syntax$top-1)).right;
		Object a = (Object)((java_cup.runtime.Symbol) CUP$Syntax$stack.elementAt(CUP$Syntax$top-1)).value;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("RRETURN",11, ((java_cup.runtime.Symbol)CUP$Syntax$stack.elementAt(CUP$Syntax$top-2)), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 35: // ASIG ::= IDENTIFICADOR IGUAL VALOR P_COMA 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("ASIG",1, ((java_cup.runtime.Symbol)CUP$Syntax$stack.elementAt(CUP$Syntax$top-3)), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 36: // PARAMETROS ::= MAS_TIPOID TIPOID 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("PARAMETROS",21, ((java_cup.runtime.Symbol)CUP$Syntax$stack.elementAt(CUP$Syntax$top-1)), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 37: // MAS_COND ::= OPR_LOGICO COND 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("MAS_COND",14, ((java_cup.runtime.Symbol)CUP$Syntax$stack.elementAt(CUP$Syntax$top-1)), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 38: // MAS_COND ::= 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("MAS_COND",14, ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 39: // COND ::= EXPR_BOOL MAS_COND 
            {
              Object RESULT =null;
		 System.out.println("TIlin"); 
              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("COND",3, ((java_cup.runtime.Symbol)CUP$Syntax$stack.elementAt(CUP$Syntax$top-1)), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 40: // DECLA ::= TIPODEDATO ASIG 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("DECLA",5, ((java_cup.runtime.Symbol)CUP$Syntax$stack.elementAt(CUP$Syntax$top-1)), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 41: // DEFINICIONES ::= DECLA 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("DEFINICIONES",6, ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 42: // DEFINICIONES ::= ASIG 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("DEFINICIONES",6, ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 43: // DEFINICIONES ::= RPRINT 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("DEFINICIONES",6, ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 44: // DEFINICIONES ::= RRETURN 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("DEFINICIONES",6, ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 45: // COMPONENTES ::= DEFINICIONES 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("COMPONENTES",2, ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 46: // COMPONENTES ::= ESTRUCTURAS 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("COMPONENTES",2, ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 47: // ESTRUCTURAS ::= RIF 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("ESTRUCTURAS",7, ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 48: // ESTRUCTURAS ::= RFOR 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("ESTRUCTURAS",7, ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 49: // ESTRUCTURAS ::= RFORIF 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("ESTRUCTURAS",7, ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 50: // CUERPO ::= I_LLAVE COMPONENTES MAS_CUERPO D_LLAVE 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("CUERPO",4, ((java_cup.runtime.Symbol)CUP$Syntax$stack.elementAt(CUP$Syntax$top-3)), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 51: // MAS_CUERPO ::= COMPONENTES MAS_CUERPO 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("MAS_CUERPO",15, ((java_cup.runtime.Symbol)CUP$Syntax$stack.elementAt(CUP$Syntax$top-1)), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 52: // MAS_CUERPO ::= 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("MAS_CUERPO",15, ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 53: // RIF ::= IF COND CUERPO VIENE_ELSE 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("RIF",27, ((java_cup.runtime.Symbol)CUP$Syntax$stack.elementAt(CUP$Syntax$top-3)), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 54: // VIENE_ELSE ::= ELSE CUERPO 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("VIENE_ELSE",30, ((java_cup.runtime.Symbol)CUP$Syntax$stack.elementAt(CUP$Syntax$top-1)), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 55: // VIENE_ELSE ::= 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("VIENE_ELSE",30, ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 56: // RFUN ::= FUN IDENTIFICADOR I_PAR PARAMETROS D_PAR RETORNO TIPODEDATO CUERPO 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("RFUN",26, ((java_cup.runtime.Symbol)CUP$Syntax$stack.elementAt(CUP$Syntax$top-7)), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 57: // RFOR ::= FOR RANGO IDENTIFICADOR INCEXP CUERPO 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("RFOR",24, ((java_cup.runtime.Symbol)CUP$Syntax$stack.elementAt(CUP$Syntax$top-4)), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 58: // RFORIF ::= FORIF COND CUERPO 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("RFORIF",25, ((java_cup.runtime.Symbol)CUP$Syntax$stack.elementAt(CUP$Syntax$top-2)), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$Syntax$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$Syntax$do_action(
    int                        CUP$Syntax$act_num,
    java_cup.runtime.lr_parser CUP$Syntax$parser,
    java.util.Stack            CUP$Syntax$stack,
    int                        CUP$Syntax$top)
    throws java.lang.Exception
    {
              return CUP$Syntax$do_action_part00000000(
                               CUP$Syntax$act_num,
                               CUP$Syntax$parser,
                               CUP$Syntax$stack,
                               CUP$Syntax$top);
    }
}

}

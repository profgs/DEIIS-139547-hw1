

/* First created by JCasGen Fri Feb 21 12:24:23 CST 2014 */
package hw1.types;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.AnnotationBase;


/** Each sentence will be divided into several tokens. We need to save where the token begins and ends, plus the total number of tokens.
 * Updated by JCasGen Fri Feb 21 14:30:29 CST 2014
 * XML source: /Users/IBAGNOG/Documents/workspace/hw1-gaby/src/main/resources/hw1-gaby-typeSystem.xml
 * @generated */
public class Token extends AnnotationBase {
  /** @generated
   * @ordered 
   */
  //@SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Token.class);
  /** @generated
   * @ordered 
   */
  //@SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated
   * @return index of the type  
   */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected Token() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Token(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Token(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** 
   * <!-- begin-user-doc -->
   * Write your own initialization here
   * <!-- end-user-doc -->
   *
   * @generated modifiable 
   */
  private void readObject() {/*default - does nothing empty block */}
     
  //*--------------*
  //* Feature: endTokenPosition

  /** getter for endTokenPosition - gets Indicate the position where the Token ends
   * @generated
   * @return value of the feature 
   */
  public int getEndTokenPosition() {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_endTokenPosition == null)
      jcasType.jcas.throwFeatMissing("endTokenPosition", "hw1.types.Token");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Token_Type)jcasType).casFeatCode_endTokenPosition);}
    
  /** setter for endTokenPosition - sets Indicate the position where the Token ends 
   * @generated
   * @param v value to set into the feature 
   */
  public void setEndTokenPosition(int v) {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_endTokenPosition == null)
      jcasType.jcas.throwFeatMissing("endTokenPosition", "hw1.types.Token");
    jcasType.ll_cas.ll_setIntValue(addr, ((Token_Type)jcasType).casFeatCode_endTokenPosition, v);}    
   
    
  //*--------------*
  //* Feature: beginTokenPostion

  /** getter for beginTokenPostion - gets Indicate the position where the Token begins.
   * @generated
   * @return value of the feature 
   */
  public int getBeginTokenPostion() {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_beginTokenPostion == null)
      jcasType.jcas.throwFeatMissing("beginTokenPostion", "hw1.types.Token");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Token_Type)jcasType).casFeatCode_beginTokenPostion);}
    
  /** setter for beginTokenPostion - sets Indicate the position where the Token begins. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setBeginTokenPostion(int v) {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_beginTokenPostion == null)
      jcasType.jcas.throwFeatMissing("beginTokenPostion", "hw1.types.Token");
    jcasType.ll_cas.ll_setIntValue(addr, ((Token_Type)jcasType).casFeatCode_beginTokenPostion, v);}    
  }

    
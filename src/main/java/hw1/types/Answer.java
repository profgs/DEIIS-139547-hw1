

/* First created by JCasGen Fri Feb 14 16:00:45 CST 2014 */
package hw1.types;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;


/** The answers originate, from an input text file and will have the following format:<Identifier><isCorrect><AnswerText>  Identifier = String, length=1, (specifically the letter ÒAÓ).   isCorrect = Int, either a 1 or a 0.  AnswerText = String { A...Z | a...z | 0...9 | Ò,Ó | Ò«Ó, ...  }
 * Updated by JCasGen Fri Feb 21 14:30:29 CST 2014
 * XML source: /Users/IBAGNOG/Documents/workspace/hw1-gaby/src/main/resources/hw1-gaby-typeSystem.xml
 * @generated */
public class Answer extends Sentence {
  /** @generated
   * @ordered 
   */
  //@SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Answer.class);
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
  protected Answer() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Answer(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Answer(JCas jcas) {
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
  //* Feature: isCorrect

  /** getter for isCorrect - gets Score given to the answer in order to know if it correct. Possible values: 0 or 1.
   * @generated
   * @return value of the feature 
   */
  public int getIsCorrect() {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_isCorrect == null)
      jcasType.jcas.throwFeatMissing("isCorrect", "hw1.types.Answer");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Answer_Type)jcasType).casFeatCode_isCorrect);}
    
  /** setter for isCorrect - sets Score given to the answer in order to know if it correct. Possible values: 0 or 1. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setIsCorrect(int v) {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_isCorrect == null)
      jcasType.jcas.throwFeatMissing("isCorrect", "hw1.types.Answer");
    jcasType.ll_cas.ll_setIntValue(addr, ((Answer_Type)jcasType).casFeatCode_isCorrect, v);}    
   
    
  //*--------------*
  //* Feature: sentencesText

  /** getter for sentencesText - gets Will contain the tokens derived from each sentence that represents an answer.
   * @generated
   * @return value of the feature 
   */
  public Token getSentencesText() {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_sentencesText == null)
      jcasType.jcas.throwFeatMissing("sentencesText", "hw1.types.Answer");
    return (Token)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Answer_Type)jcasType).casFeatCode_sentencesText)));}
    
  /** setter for sentencesText - sets Will contain the tokens derived from each sentence that represents an answer. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setSentencesText(Token v) {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_sentencesText == null)
      jcasType.jcas.throwFeatMissing("sentencesText", "hw1.types.Answer");
    jcasType.ll_cas.ll_setRefValue(addr, ((Answer_Type)jcasType).casFeatCode_sentencesText, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    
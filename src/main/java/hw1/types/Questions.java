

/* First created by JCasGen Fri Feb 14 16:00:45 CST 2014 */
package hw1.types;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;


import org.apache.uima.jcas.cas.StringArray;


/** The question comes from an input text file, which will have the following format:<Identifier>  < QuestionText >Identifier = String, length=1, (specifically the letter ÒQÓ). 
QuestionText = String { A...Z | a...z | 0...9 | Ò,Ó | Ò«Ó, ...  }
 * Updated by JCasGen Fri Feb 21 14:30:29 CST 2014
 * XML source: /Users/IBAGNOG/Documents/workspace/hw1-gaby/src/main/resources/hw1-gaby-typeSystem.xml
 * @generated */
public class Questions extends Sentence {
  /** @generated
   * @ordered 
   */
 // @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Questions.class);
  /** @generated
   * @ordered 
   */
//  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated
   * @return index of the type  
   */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected Questions() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Questions(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Questions(JCas jcas) {
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
  //* Feature: sentenceText

  /** getter for sentenceText - gets Senteces corresponding to the question being asked.
   * @generated
   * @return value of the feature 
   */
  public StringArray getSentenceText() {
    if (Questions_Type.featOkTst && ((Questions_Type)jcasType).casFeat_sentenceText == null)
      jcasType.jcas.throwFeatMissing("sentenceText", "hw1.types.Questions");
    return (StringArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Questions_Type)jcasType).casFeatCode_sentenceText)));}
    
  /** setter for sentenceText - sets Senteces corresponding to the question being asked. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setSentenceText(StringArray v) {
    if (Questions_Type.featOkTst && ((Questions_Type)jcasType).casFeat_sentenceText == null)
      jcasType.jcas.throwFeatMissing("sentenceText", "hw1.types.Questions");
    jcasType.ll_cas.ll_setRefValue(addr, ((Questions_Type)jcasType).casFeatCode_sentenceText, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for sentenceText - gets an indexed value - Senteces corresponding to the question being asked.
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public String getSentenceText(int i) {
    if (Questions_Type.featOkTst && ((Questions_Type)jcasType).casFeat_sentenceText == null)
      jcasType.jcas.throwFeatMissing("sentenceText", "hw1.types.Questions");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Questions_Type)jcasType).casFeatCode_sentenceText), i);
    return jcasType.ll_cas.ll_getStringArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Questions_Type)jcasType).casFeatCode_sentenceText), i);}

  /** indexed setter for sentenceText - sets an indexed value - Senteces corresponding to the question being asked.
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setSentenceText(int i, String v) { 
    if (Questions_Type.featOkTst && ((Questions_Type)jcasType).casFeat_sentenceText == null)
      jcasType.jcas.throwFeatMissing("sentenceText", "hw1.types.Questions");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Questions_Type)jcasType).casFeatCode_sentenceText), i);
    jcasType.ll_cas.ll_setStringArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Questions_Type)jcasType).casFeatCode_sentenceText), i, v);}
  }

    
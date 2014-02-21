

/* First created by JCasGen Wed Feb 19 19:29:53 CST 2014 */
package hw1.types;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.AnnotationBase;
import org.apache.uima.jcas.cas.StringArray;


//import org.apache.uima.jcas.tcas.Annotation;


/** This annotation represents the general view of the problem, a sentence, from which a question or answer can derive. 
 * Updated by JCasGen Fri Feb 21 14:30:29 CST 2014
 * XML source: /Users/IBAGNOG/Documents/workspace/hw1-gaby/src/main/resources/hw1-gaby-typeSystem.xml
 * @generated */
public class Sentence extends AnnotationBase {
  /** @generated
   * @ordered 
   */
 // @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Sentence.class);
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
  protected Sentence() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Sentence(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Sentence(JCas jcas) {
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

  /** getter for sentenceText - gets Contains the raw sentences taken from the input text file.
   * @generated
   * @return value of the feature 
   */
  public StringArray getSentenceText() {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_sentenceText == null)
      jcasType.jcas.throwFeatMissing("sentenceText", "hw1.types.Sentence");
    return (StringArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_sentenceText)));}
    
  /** setter for sentenceText - sets Contains the raw sentences taken from the input text file. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setSentenceText(StringArray v) {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_sentenceText == null)
      jcasType.jcas.throwFeatMissing("sentenceText", "hw1.types.Sentence");
    jcasType.ll_cas.ll_setRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_sentenceText, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for sentenceText - gets an indexed value - Contains the raw sentences taken from the input text file.
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public String getSentenceText(int i) {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_sentenceText == null)
      jcasType.jcas.throwFeatMissing("sentenceText", "hw1.types.Sentence");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_sentenceText), i);
    return jcasType.ll_cas.ll_getStringArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_sentenceText), i);}

  /** indexed setter for sentenceText - sets an indexed value - Contains the raw sentences taken from the input text file.
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setSentenceText(int i, String v) { 
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_sentenceText == null)
      jcasType.jcas.throwFeatMissing("sentenceText", "hw1.types.Sentence");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_sentenceText), i);
    jcasType.ll_cas.ll_setStringArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_sentenceText), i, v);}
  }

    
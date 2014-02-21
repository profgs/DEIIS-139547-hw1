

/* First created by JCasGen Fri Feb 14 16:01:50 CST 2014 */
package hw1.types;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.AnnotationBase;
import org.apache.uima.jcas.cas.FSList;

/** Will sort the answers according to their scores, and calculate precision at N (where N is the total number of correct answers).
 * Updated by JCasGen Fri Feb 21 14:30:29 CST 2014
 * XML source: /Users/IBAGNOG/Documents/workspace/hw1-gaby/src/main/resources/hw1-gaby-typeSystem.xml
 * @generated */
public class Results extends AnnotationBase {
  /** @generated
   * @ordered 
   */
 // @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Results.class);
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
  protected Results() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Results(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Results(JCas jcas) {
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
  //* Feature: precision

  /** getter for precision - gets Measures the presicion @ N
   * @generated
   * @return value of the feature 
   */
  public double getPrecision() {
    if (Results_Type.featOkTst && ((Results_Type)jcasType).casFeat_precision == null)
      jcasType.jcas.throwFeatMissing("precision", "hw1.types.Results");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((Results_Type)jcasType).casFeatCode_precision);}
    
  /** setter for precision - sets Measures the presicion @ N 
   * @generated
   * @param v value to set into the feature 
   */
  public void setPrecision(double v) {
    if (Results_Type.featOkTst && ((Results_Type)jcasType).casFeat_precision == null)
      jcasType.jcas.throwFeatMissing("precision", "hw1.types.Results");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((Results_Type)jcasType).casFeatCode_precision, v);}    
   
    
  //*--------------*
  //* Feature: sizeN

  /** getter for sizeN - gets Takes the value of N, at which precision will be calculated.
   * @generated
   * @return value of the feature 
   */
  public int getSizeN() {
    if (Results_Type.featOkTst && ((Results_Type)jcasType).casFeat_sizeN == null)
      jcasType.jcas.throwFeatMissing("sizeN", "hw1.types.Results");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Results_Type)jcasType).casFeatCode_sizeN);}
    
  /** setter for sizeN - sets Takes the value of N, at which precision will be calculated. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setSizeN(int v) {
    if (Results_Type.featOkTst && ((Results_Type)jcasType).casFeat_sizeN == null)
      jcasType.jcas.throwFeatMissing("sizeN", "hw1.types.Results");
    jcasType.ll_cas.ll_setIntValue(addr, ((Results_Type)jcasType).casFeatCode_sizeN, v);}    
   
    
  //*--------------*
  //* Feature: ordListAnswers

  /** getter for ordListAnswers - gets Will list the answers in order according to presicion @ N calculation.
   * @generated
   * @return value of the feature 
   */
  public FSList getOrdListAnswers() {
    if (Results_Type.featOkTst && ((Results_Type)jcasType).casFeat_ordListAnswers == null)
      jcasType.jcas.throwFeatMissing("ordListAnswers", "hw1.types.Results");
    return (FSList)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Results_Type)jcasType).casFeatCode_ordListAnswers)));}
    
  /** setter for ordListAnswers - sets Will list the answers in order according to presicion @ N calculation. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setOrdListAnswers(FSList v) {
    if (Results_Type.featOkTst && ((Results_Type)jcasType).casFeat_ordListAnswers == null)
      jcasType.jcas.throwFeatMissing("ordListAnswers", "hw1.types.Results");
    jcasType.ll_cas.ll_setRefValue(addr, ((Results_Type)jcasType).casFeatCode_ordListAnswers, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    
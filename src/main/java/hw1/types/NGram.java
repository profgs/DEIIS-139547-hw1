

/* First created by JCasGen Fri Feb 14 16:01:50 CST 2014 */
package hw1.types;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.AnnotationBase;



/** The system will annotate 1-, 2- and 3-grams of consecutive tokens. 
 * Updated by JCasGen Fri Feb 21 14:30:29 CST 2014
 * XML source: /Users/IBAGNOG/Documents/workspace/hw1-gaby/src/main/resources/hw1-gaby-typeSystem.xml
 * @generated */
public class NGram extends AnnotationBase {
  /** @generated
   * @ordered 
   */
 // @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(NGram.class);
  /** @generated
   * @ordered 
   */
 // @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated
   * @return index of the type  
   */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected NGram() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public NGram(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public NGram(JCas jcas) {
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
  //* Feature: SizeN

  /** getter for SizeN - gets Size of the NGram. N can be 1, 2 or 3.
   * @generated
   * @return value of the feature 
   */
  public int getSizeN() {
    if (NGram_Type.featOkTst && ((NGram_Type)jcasType).casFeat_SizeN == null)
      jcasType.jcas.throwFeatMissing("SizeN", "hw1.types.NGram");
    return jcasType.ll_cas.ll_getIntValue(addr, ((NGram_Type)jcasType).casFeatCode_SizeN);}
    
  /** setter for SizeN - sets Size of the NGram. N can be 1, 2 or 3. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setSizeN(int v) {
    if (NGram_Type.featOkTst && ((NGram_Type)jcasType).casFeat_SizeN == null)
      jcasType.jcas.throwFeatMissing("SizeN", "hw1.types.NGram");
    jcasType.ll_cas.ll_setIntValue(addr, ((NGram_Type)jcasType).casFeatCode_SizeN, v);}    
  }

    
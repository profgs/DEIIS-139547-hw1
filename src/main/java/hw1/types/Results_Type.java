
/* First created by JCasGen Fri Feb 14 16:01:50 CST 2014 */
package hw1.types;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.cas.AnnotationBase_Type;

/** Will sort the answers according to their scores, and calculate precision at N (where N is the total number of correct answers).
 * Updated by JCasGen Fri Feb 21 14:30:29 CST 2014
 * @generated */
public class Results_Type extends AnnotationBase_Type {
  /** @generated 
   * @return the generator for this type
   */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Results_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Results_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Results(addr, Results_Type.this);
  			   Results_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Results(addr, Results_Type.this);
  	  }
    };
  /** @generated */
  //@SuppressWarnings ("hiding")
  public final static int typeIndexID = Results.typeIndexID;
  /** @generated 
     @modifiable */
  //@SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("hw1.types.Results");



  /** @generated */
  final Feature casFeat_precision;
  /** @generated */
  final int     casFeatCode_precision;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public double getPrecision(int addr) {
        if (featOkTst && casFeat_precision == null)
      jcas.throwFeatMissing("precision", "hw1.types.Results");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_precision);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setPrecision(int addr, double v) {
        if (featOkTst && casFeat_precision == null)
      jcas.throwFeatMissing("precision", "hw1.types.Results");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_precision, v);}
    
  
 
  /** @generated */
  final Feature casFeat_sizeN;
  /** @generated */
  final int     casFeatCode_sizeN;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getSizeN(int addr) {
        if (featOkTst && casFeat_sizeN == null)
      jcas.throwFeatMissing("sizeN", "hw1.types.Results");
    return ll_cas.ll_getIntValue(addr, casFeatCode_sizeN);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setSizeN(int addr, int v) {
        if (featOkTst && casFeat_sizeN == null)
      jcas.throwFeatMissing("sizeN", "hw1.types.Results");
    ll_cas.ll_setIntValue(addr, casFeatCode_sizeN, v);}
    
  
 
  /** @generated */
  final Feature casFeat_ordListAnswers;
  /** @generated */
  final int     casFeatCode_ordListAnswers;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getOrdListAnswers(int addr) {
        if (featOkTst && casFeat_ordListAnswers == null)
      jcas.throwFeatMissing("ordListAnswers", "hw1.types.Results");
    return ll_cas.ll_getRefValue(addr, casFeatCode_ordListAnswers);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setOrdListAnswers(int addr, int v) {
        if (featOkTst && casFeat_ordListAnswers == null)
      jcas.throwFeatMissing("ordListAnswers", "hw1.types.Results");
    ll_cas.ll_setRefValue(addr, casFeatCode_ordListAnswers, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Results_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_precision = jcas.getRequiredFeatureDE(casType, "precision", "uima.cas.Double", featOkTst);
    casFeatCode_precision  = (null == casFeat_precision) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_precision).getCode();

 
    casFeat_sizeN = jcas.getRequiredFeatureDE(casType, "sizeN", "uima.cas.Integer", featOkTst);
    casFeatCode_sizeN  = (null == casFeat_sizeN) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_sizeN).getCode();

 
    casFeat_ordListAnswers = jcas.getRequiredFeatureDE(casType, "ordListAnswers", "uima.cas.FSList", featOkTst);
    casFeatCode_ordListAnswers  = (null == casFeat_ordListAnswers) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_ordListAnswers).getCode();

  }
}



    

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

/** The system will annotate 1-, 2- and 3-grams of consecutive tokens. 
 * Updated by JCasGen Fri Feb 21 14:30:29 CST 2014
 * @generated */
public class NGram_Type extends AnnotationBase_Type {
  /** @generated 
   * @return the generator for this type
   */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (NGram_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = NGram_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new NGram(addr, NGram_Type.this);
  			   NGram_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new NGram(addr, NGram_Type.this);
  	  }
    };
  /** @generated */
  //@SuppressWarnings ("hiding")
  public final static int typeIndexID = NGram.typeIndexID;
  /** @generated 
     @modifiable */
  //@SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("hw1.types.NGram");



  /** @generated */
  final Feature casFeat_SizeN;
  /** @generated */
  final int     casFeatCode_SizeN;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getSizeN(int addr) {
        if (featOkTst && casFeat_SizeN == null)
      jcas.throwFeatMissing("SizeN", "hw1.types.NGram");
    return ll_cas.ll_getIntValue(addr, casFeatCode_SizeN);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setSizeN(int addr, int v) {
        if (featOkTst && casFeat_SizeN == null)
      jcas.throwFeatMissing("SizeN", "hw1.types.NGram");
    ll_cas.ll_setIntValue(addr, casFeatCode_SizeN, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public NGram_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_SizeN = jcas.getRequiredFeatureDE(casType, "SizeN", "uima.cas.Integer", featOkTst);
    casFeatCode_SizeN  = (null == casFeat_SizeN) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_SizeN).getCode();

  }
}



    
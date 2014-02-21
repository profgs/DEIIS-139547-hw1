
/* First created by JCasGen Wed Feb 19 19:29:53 CST 2014 */
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


/** This annotation represents the general view of the problem, a sentence, from which a question or answer can derive. 
 * Updated by JCasGen Fri Feb 21 14:30:29 CST 2014
 * @generated */
public class Sentence_Type extends AnnotationBase_Type {
  /** @generated 
   * @return the generator for this type
   */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Sentence_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Sentence_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Sentence(addr, Sentence_Type.this);
  			   Sentence_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Sentence(addr, Sentence_Type.this);
  	  }
    };
  /** @generated */
  //@SuppressWarnings ("hiding")
  public final static int typeIndexID = Sentence.typeIndexID;
  /** @generated 
     @modifiable */
 // @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("hw1.types.Sentence");



  /** @generated */
  final Feature casFeat_sentenceText;
  /** @generated */
  final int     casFeatCode_sentenceText;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getSentenceText(int addr) {
        if (featOkTst && casFeat_sentenceText == null)
      jcas.throwFeatMissing("sentenceText", "hw1.types.Sentence");
    return ll_cas.ll_getRefValue(addr, casFeatCode_sentenceText);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setSentenceText(int addr, int v) {
        if (featOkTst && casFeat_sentenceText == null)
      jcas.throwFeatMissing("sentenceText", "hw1.types.Sentence");
    ll_cas.ll_setRefValue(addr, casFeatCode_sentenceText, v);}
    
   /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @return value at index i in the array 
   */
  public String getSentenceText(int addr, int i) {
        if (featOkTst && casFeat_sentenceText == null)
      jcas.throwFeatMissing("sentenceText", "hw1.types.Sentence");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_sentenceText), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_sentenceText), i);
  return ll_cas.ll_getStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_sentenceText), i);
  }
   
  /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @param v value to set
   */ 
  public void setSentenceText(int addr, int i, String v) {
        if (featOkTst && casFeat_sentenceText == null)
      jcas.throwFeatMissing("sentenceText", "hw1.types.Sentence");
    if (lowLevelTypeChecks)
      ll_cas.ll_setStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_sentenceText), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_sentenceText), i);
    ll_cas.ll_setStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_sentenceText), i, v);
  }
 



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Sentence_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_sentenceText = jcas.getRequiredFeatureDE(casType, "sentenceText", "uima.cas.StringArray", featOkTst);
    casFeatCode_sentenceText  = (null == casFeat_sentenceText) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_sentenceText).getCode();

  }
}



    
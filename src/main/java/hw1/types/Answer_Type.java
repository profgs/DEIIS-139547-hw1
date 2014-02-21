
/* First created by JCasGen Fri Feb 14 16:00:45 CST 2014 */
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


/** The answers originate, from an input text file and will have the following format:<Identifier><isCorrect><AnswerText>  Identifier = String, length=1, (specifically the letter ÒAÓ).   isCorrect = Int, either a 1 or a 0.  AnswerText = String { A...Z | a...z | 0...9 | Ò,Ó | Ò«Ó, ...  }
 * Updated by JCasGen Fri Feb 21 14:30:29 CST 2014
 * @generated */
public class Answer_Type extends Sentence_Type {
  /** @generated 
   * @return the generator for this type
   */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Answer_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Answer_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Answer(addr, Answer_Type.this);
  			   Answer_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Answer(addr, Answer_Type.this);
  	  }
    };
  /** @generated */
  //@SuppressWarnings ("hiding")
  public final static int typeIndexID = Answer.typeIndexID;
  /** @generated 
     @modifiable */
 // @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("hw1.types.Answer");



  /** @generated */
  final Feature casFeat_isCorrect;
  /** @generated */
  final int     casFeatCode_isCorrect;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getIsCorrect(int addr) {
        if (featOkTst && casFeat_isCorrect == null)
      jcas.throwFeatMissing("isCorrect", "hw1.types.Answer");
    return ll_cas.ll_getIntValue(addr, casFeatCode_isCorrect);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setIsCorrect(int addr, int v) {
        if (featOkTst && casFeat_isCorrect == null)
      jcas.throwFeatMissing("isCorrect", "hw1.types.Answer");
    ll_cas.ll_setIntValue(addr, casFeatCode_isCorrect, v);}
    
  
 
  /** @generated */
  final Feature casFeat_sentencesText;
  /** @generated */
  final int     casFeatCode_sentencesText;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getSentencesText(int addr) {
        if (featOkTst && casFeat_sentencesText == null)
      jcas.throwFeatMissing("sentencesText", "hw1.types.Answer");
    return ll_cas.ll_getRefValue(addr, casFeatCode_sentencesText);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setSentencesText(int addr, int v) {
        if (featOkTst && casFeat_sentencesText == null)
      jcas.throwFeatMissing("sentencesText", "hw1.types.Answer");
    ll_cas.ll_setRefValue(addr, casFeatCode_sentencesText, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Answer_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_isCorrect = jcas.getRequiredFeatureDE(casType, "isCorrect", "uima.cas.Integer", featOkTst);
    casFeatCode_isCorrect  = (null == casFeat_isCorrect) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_isCorrect).getCode();

 
    casFeat_sentencesText = jcas.getRequiredFeatureDE(casType, "sentencesText", "hw1.types.Token", featOkTst);
    casFeatCode_sentencesText  = (null == casFeat_sentencesText) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_sentencesText).getCode();

  }
}



    

/* First created by JCasGen Fri Feb 21 12:24:23 CST 2014 */
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


/** Each sentence will be divided into several tokens. We need to save where the token begins and ends, plus the total number of tokens.
 * Updated by JCasGen Fri Feb 21 14:30:29 CST 2014
 * @generated */
public class Token_Type extends AnnotationBase_Type {
  /** @generated 
   * @return the generator for this type
   */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Token_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Token_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Token(addr, Token_Type.this);
  			   Token_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Token(addr, Token_Type.this);
  	  }
    };
  /** @generated */
  //@SuppressWarnings ("hiding")
  public final static int typeIndexID = Token.typeIndexID;
  /** @generated 
     @modifiable */
  //@SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("hw1.types.Token");



  /** @generated */
  final Feature casFeat_endTokenPosition;
  /** @generated */
  final int     casFeatCode_endTokenPosition;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getEndTokenPosition(int addr) {
        if (featOkTst && casFeat_endTokenPosition == null)
      jcas.throwFeatMissing("endTokenPosition", "hw1.types.Token");
    return ll_cas.ll_getIntValue(addr, casFeatCode_endTokenPosition);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setEndTokenPosition(int addr, int v) {
        if (featOkTst && casFeat_endTokenPosition == null)
      jcas.throwFeatMissing("endTokenPosition", "hw1.types.Token");
    ll_cas.ll_setIntValue(addr, casFeatCode_endTokenPosition, v);}
    
  
 
  /** @generated */
  final Feature casFeat_beginTokenPostion;
  /** @generated */
  final int     casFeatCode_beginTokenPostion;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getBeginTokenPostion(int addr) {
        if (featOkTst && casFeat_beginTokenPostion == null)
      jcas.throwFeatMissing("beginTokenPostion", "hw1.types.Token");
    return ll_cas.ll_getIntValue(addr, casFeatCode_beginTokenPostion);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setBeginTokenPostion(int addr, int v) {
        if (featOkTst && casFeat_beginTokenPostion == null)
      jcas.throwFeatMissing("beginTokenPostion", "hw1.types.Token");
    ll_cas.ll_setIntValue(addr, casFeatCode_beginTokenPostion, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Token_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_endTokenPosition = jcas.getRequiredFeatureDE(casType, "endTokenPosition", "uima.cas.Integer", featOkTst);
    casFeatCode_endTokenPosition  = (null == casFeat_endTokenPosition) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_endTokenPosition).getCode();

 
    casFeat_beginTokenPostion = jcas.getRequiredFeatureDE(casType, "beginTokenPostion", "uima.cas.Integer", featOkTst);
    casFeatCode_beginTokenPostion  = (null == casFeat_beginTokenPostion) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_beginTokenPostion).getCode();

  }
}



    
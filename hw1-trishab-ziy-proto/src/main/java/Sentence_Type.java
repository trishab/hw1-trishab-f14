
/* First created by JCasGen Tue Oct 07 14:36:28 EDT 2014 */

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** 
 * Updated by JCasGen Tue Oct 07 15:01:46 EDT 2014
 * @generated */
public class Sentence_Type extends Annotation_Type {
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
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Sentence.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("Sentence");
 
  /** @generated */
  final Feature casFeat_GetID;
  /** @generated */
  final int     casFeatCode_GetID;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getGetID(int addr) {
        if (featOkTst && casFeat_GetID == null)
      jcas.throwFeatMissing("GetID", "Sentence");
    return ll_cas.ll_getStringValue(addr, casFeatCode_GetID);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setGetID(int addr, String v) {
        if (featOkTst && casFeat_GetID == null)
      jcas.throwFeatMissing("GetID", "Sentence");
    ll_cas.ll_setStringValue(addr, casFeatCode_GetID, v);}
    
  
 
  /** @generated */
  final Feature casFeat_GetText;
  /** @generated */
  final int     casFeatCode_GetText;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getGetText(int addr) {
        if (featOkTst && casFeat_GetText == null)
      jcas.throwFeatMissing("GetText", "Sentence");
    return ll_cas.ll_getStringValue(addr, casFeatCode_GetText);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setGetText(int addr, String v) {
        if (featOkTst && casFeat_GetText == null)
      jcas.throwFeatMissing("GetText", "Sentence");
    ll_cas.ll_setStringValue(addr, casFeatCode_GetText, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Sentence_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_GetID = jcas.getRequiredFeatureDE(casType, "GetID", "uima.cas.String", featOkTst);
    casFeatCode_GetID  = (null == casFeat_GetID) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_GetID).getCode();

 
    casFeat_GetText = jcas.getRequiredFeatureDE(casType, "GetText", "uima.cas.String", featOkTst);
    casFeatCode_GetText  = (null == casFeat_GetText) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_GetText).getCode();

  }
}



    
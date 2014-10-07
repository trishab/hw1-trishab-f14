
/* First created by JCasGen Tue Oct 07 09:46:27 EDT 2014 */

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
public class Gene_Type extends Annotation_Type {
  /** @generated 
   * @return the generator for this type
   */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Gene_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Gene_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Gene(addr, Gene_Type.this);
  			   Gene_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Gene(addr, Gene_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Gene.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("Gene");
 
  /** @generated */
  final Feature casFeat_ID;
  /** @generated */
  final int     casFeatCode_ID;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getID(int addr) {
        if (featOkTst && casFeat_ID == null)
      jcas.throwFeatMissing("ID", "Gene");
    return ll_cas.ll_getStringValue(addr, casFeatCode_ID);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setID(int addr, String v) {
        if (featOkTst && casFeat_ID == null)
      jcas.throwFeatMissing("ID", "Gene");
    ll_cas.ll_setStringValue(addr, casFeatCode_ID, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Start;
  /** @generated */
  final int     casFeatCode_Start;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getStart(int addr) {
        if (featOkTst && casFeat_Start == null)
      jcas.throwFeatMissing("Start", "Gene");
    return ll_cas.ll_getIntValue(addr, casFeatCode_Start);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setStart(int addr, int v) {
        if (featOkTst && casFeat_Start == null)
      jcas.throwFeatMissing("Start", "Gene");
    ll_cas.ll_setIntValue(addr, casFeatCode_Start, v);}
    
  
 
  /** @generated */
  final Feature casFeat_End;
  /** @generated */
  final int     casFeatCode_End;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getEnd(int addr) {
        if (featOkTst && casFeat_End == null)
      jcas.throwFeatMissing("End", "Gene");
    return ll_cas.ll_getIntValue(addr, casFeatCode_End);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setEnd(int addr, int v) {
        if (featOkTst && casFeat_End == null)
      jcas.throwFeatMissing("End", "Gene");
    ll_cas.ll_setIntValue(addr, casFeatCode_End, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Text;
  /** @generated */
  final int     casFeatCode_Text;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getText(int addr) {
        if (featOkTst && casFeat_Text == null)
      jcas.throwFeatMissing("Text", "Gene");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Text);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setText(int addr, String v) {
        if (featOkTst && casFeat_Text == null)
      jcas.throwFeatMissing("Text", "Gene");
    ll_cas.ll_setStringValue(addr, casFeatCode_Text, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Gene_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_ID = jcas.getRequiredFeatureDE(casType, "ID", "uima.cas.String", featOkTst);
    casFeatCode_ID  = (null == casFeat_ID) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_ID).getCode();

 
    casFeat_Start = jcas.getRequiredFeatureDE(casType, "Start", "uima.cas.Integer", featOkTst);
    casFeatCode_Start  = (null == casFeat_Start) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Start).getCode();

 
    casFeat_End = jcas.getRequiredFeatureDE(casType, "End", "uima.cas.Integer", featOkTst);
    casFeatCode_End  = (null == casFeat_End) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_End).getCode();

 
    casFeat_Text = jcas.getRequiredFeatureDE(casType, "Text", "uima.cas.String", featOkTst);
    casFeatCode_Text  = (null == casFeat_Text) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Text).getCode();

  }
}



    
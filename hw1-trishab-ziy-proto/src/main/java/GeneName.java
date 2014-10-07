

/* First created by JCasGen Tue Oct 07 10:55:16 EDT 2014 */

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Tue Oct 07 14:38:36 EDT 2014
 * XML source: /Users/Trisha/git/hw1-trishab-f14/hw1-trishab-ziy-proto/src/main/resources/GeneName.xml
 * @generated */
public class GeneName extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(GeneName.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated
   * @return index of the type  
   */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected GeneName() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public GeneName(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public GeneName(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public GeneName(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
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
  //* Feature: GetID

  /** getter for GetID - gets 
   * @generated
   * @return value of the feature 
   */
  public String getGetID() {
    if (GeneName_Type.featOkTst && ((GeneName_Type)jcasType).casFeat_GetID == null)
      jcasType.jcas.throwFeatMissing("GetID", "GeneName");
    return jcasType.ll_cas.ll_getStringValue(addr, ((GeneName_Type)jcasType).casFeatCode_GetID);}
    
  /** setter for GetID - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setGetID(String v) {
    if (GeneName_Type.featOkTst && ((GeneName_Type)jcasType).casFeat_GetID == null)
      jcasType.jcas.throwFeatMissing("GetID", "GeneName");
    jcasType.ll_cas.ll_setStringValue(addr, ((GeneName_Type)jcasType).casFeatCode_GetID, v);}    
   
    
  //*--------------*
  //* Feature: GetText

  /** getter for GetText - gets 
   * @generated
   * @return value of the feature 
   */
  public String getGetText() {
    if (GeneName_Type.featOkTst && ((GeneName_Type)jcasType).casFeat_GetText == null)
      jcasType.jcas.throwFeatMissing("GetText", "GeneName");
    return jcasType.ll_cas.ll_getStringValue(addr, ((GeneName_Type)jcasType).casFeatCode_GetText);}
    
  /** setter for GetText - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setGetText(String v) {
    if (GeneName_Type.featOkTst && ((GeneName_Type)jcasType).casFeat_GetText == null)
      jcasType.jcas.throwFeatMissing("GetText", "GeneName");
    jcasType.ll_cas.ll_setStringValue(addr, ((GeneName_Type)jcasType).casFeatCode_GetText, v);}    
  }

    
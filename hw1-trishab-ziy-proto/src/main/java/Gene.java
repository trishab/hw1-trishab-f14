

/* First created by JCasGen Tue Oct 07 09:46:27 EDT 2014 */

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Tue Oct 07 15:01:46 EDT 2014
 * XML source: /Users/Trisha/git/hw1-trishab-f14/hw1-trishab-ziy-proto/src/main/resources/collectionReaderDescriptor.xml
 * @generated */
public class Gene extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Gene.class);
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
  protected Gene() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Gene(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Gene(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Gene(JCas jcas, int begin, int end) {
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
  //* Feature: ID

  /** getter for ID - gets 
   * @generated
   * @return value of the feature 
   */
  public String getID() {
    if (Gene_Type.featOkTst && ((Gene_Type)jcasType).casFeat_ID == null)
      jcasType.jcas.throwFeatMissing("ID", "Gene");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Gene_Type)jcasType).casFeatCode_ID);}
    
  /** setter for ID - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setID(String v) {
    if (Gene_Type.featOkTst && ((Gene_Type)jcasType).casFeat_ID == null)
      jcasType.jcas.throwFeatMissing("ID", "Gene");
    jcasType.ll_cas.ll_setStringValue(addr, ((Gene_Type)jcasType).casFeatCode_ID, v);}    
   
    
  //*--------------*
  //* Feature: Start

  /** getter for Start - gets 
   * @generated
   * @return value of the feature 
   */
  public int getStart() {
    if (Gene_Type.featOkTst && ((Gene_Type)jcasType).casFeat_Start == null)
      jcasType.jcas.throwFeatMissing("Start", "Gene");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Gene_Type)jcasType).casFeatCode_Start);}
    
  /** setter for Start - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setStart(int v) {
    if (Gene_Type.featOkTst && ((Gene_Type)jcasType).casFeat_Start == null)
      jcasType.jcas.throwFeatMissing("Start", "Gene");
    jcasType.ll_cas.ll_setIntValue(addr, ((Gene_Type)jcasType).casFeatCode_Start, v);}    
   
    
  //*--------------*
  //* Feature: End

  /** getter for End - gets 
   * @generated
   * @return value of the feature 
   */
  public int getEnd() {
    if (Gene_Type.featOkTst && ((Gene_Type)jcasType).casFeat_End == null)
      jcasType.jcas.throwFeatMissing("End", "Gene");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Gene_Type)jcasType).casFeatCode_End);}
    
  /** setter for End - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setEnd(int v) {
    if (Gene_Type.featOkTst && ((Gene_Type)jcasType).casFeat_End == null)
      jcasType.jcas.throwFeatMissing("End", "Gene");
    jcasType.ll_cas.ll_setIntValue(addr, ((Gene_Type)jcasType).casFeatCode_End, v);}    
   
    
  //*--------------*
  //* Feature: Text

  /** getter for Text - gets 
   * @generated
   * @return value of the feature 
   */
  public String getText() {
    if (Gene_Type.featOkTst && ((Gene_Type)jcasType).casFeat_Text == null)
      jcasType.jcas.throwFeatMissing("Text", "Gene");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Gene_Type)jcasType).casFeatCode_Text);}
    
  /** setter for Text - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setText(String v) {
    if (Gene_Type.featOkTst && ((Gene_Type)jcasType).casFeat_Text == null)
      jcasType.jcas.throwFeatMissing("Text", "Gene");
    jcasType.ll_cas.ll_setStringValue(addr, ((Gene_Type)jcasType).casFeatCode_Text, v);}    
  }

    
//package data;
////import GeneName;
//
//import java.io.BufferedReader;
//import java.io.File;
//import java.io.FileReader;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.regex.Pattern;
//
//import javax.naming.spi.DirStateFactory.Result;
//
//import org.apache.uima.cas.CAS;
//import org.apache.uima.cas.CASException;
//import org.apache.uima.collection.CollectionException;
//import org.apache.uima.collection.CollectionReader_ImplBase;
//import org.apache.uima.jcas.JCas;
//import org.apache.uima.resource.ResourceInitializationException;
//import org.apache.uima.util.FileUtils;
//import org.apache.uima.util.Progress;
//import org.apache.xerces.impl.xs.identity.Selector.Matcher;
//
//public class CollectionReader extends CollectionReader_ImplBase{
//
//public static final String PARAM_INPUTDIR = "InputDocument";
//  
//  private ArrayList<String> cfile;
//  int isfinish;
//
//  
//  /**
//   * @see org.apache.uima.collection.CollectionReader_ImplBase#initialize()
//   */
//  public void initialize() throws ResourceInitializationException {
//    // this file has not been opened
//    isfinish = 1;
//    File directory = new File(((String) getConfigParameterValue(PARAM_INPUTDIR)).trim());
//    try {
//      cfile=ReadFile(directory);
//    } catch (IOException e) {
//      // TODO Auto-generated catch block
//      e.printStackTrace();
//    }
//
//   }
//  
//  /**
//   * This method saves all sentences in one ArrayList and return this ArrayList
//   * 
//   * @param FileName 
//   * @return result 
//   * @throws IOException
//   */
//  private ArrayList<String> ReadFile(File FileName) throws IOException {
//  
//    //Using BufferReader
//    BufferedReader reader = null;
//    ArrayList<String> result;     
//    result= new ArrayList<String>();
//      
//    reader = new BufferedReader(new FileReader(FileName));
//    String sCurrentline = reader.readLine();
//      
//    while(sCurrentline != null){
//      result.add(sCurrentline);
//      sCurrentline = reader.readLine();
//    }
//      
//    reader.close();
//    return result;
//       
//} 
//  
//  @Override
//  /**
//   * This method split sentences into 2 parts and return each sentence as a CAS
//   * @see org.apache.uima.collection.CollectionReader#getNext(org.apache.uima.cas.CAS)
//   */
//  public void getNext(CAS aCas) throws IOException, CollectionException {
//    // TODO Auto-generated method stub 
//    JCas jcas;
//    try {
//      jcas = aCas.getJCas();
//    } catch (CASException e) {
//      throw new CollectionException(e);
//    }
//    
// 
///*
// *  ArrayList and process sentences one by one
// */
//    for(int j=0; j<cfile.size(); j++){
//      String line = cfile.get(j);
//      //Dividing each sentence into two parts: 1.ID   2.text
//      String[] fields = line.split(" ", 2);  
//      
//      //Create sentence annotation CAS
//      GeneName BaseDescriptor = new GeneName(jcas);
//      BaseDescriptor.setGetID(fields[0]);
//      BaseDescriptor.setGetText(fields[1]);
//      BaseDescriptor.addToIndexes();
//    }
//    //This file has been opened
//    isfinish = 0;
//
//  }
//  
// 
//  @Override
//  public void close() throws IOException {
//    // TODO Auto-generated method stub
//
//  }
//
//  @Override
//  public Progress[] getProgress() {
//    // TODO Auto-generated method stub
//    return null;
//  }
//
//  
//  /**
//   * The terminal condition of stopping reading file
//   * @see org.apache.uima.collection.CollectionReader#hasNext()
//   */
//  @Override
//  public boolean hasNext() throws IOException, CollectionException {
//    // TODO Auto-generated method stub
//
//    if(isfinish == 0) return false;
//    else return true;
//  }
//
//}
//

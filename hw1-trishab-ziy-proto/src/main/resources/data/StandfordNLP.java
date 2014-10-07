//package data;
//import Gene;
//import GeneName;
//import PosTagNamedEntityRecognizer;
//
//import java.util.HashMap;
//import java.util.Iterator;
//import java.util.Map;
//
//import org.apache.uima.analysis_component.CasAnnotator_ImplBase;
//import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
//import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
//import org.apache.uima.cas.CAS;
//import org.apache.uima.jcas.JCas;
//import org.apache.uima.resource.ResourceInitializationException;
//
//
//public class StandfordNLP extends JCasAnnotator_ImplBase {
//  @Override
//  public void process(JCas ajCAS) throws AnalysisEngineProcessException {
//    // TODO Auto-generated method stub
//    
//    Iterator<org.apache.uima.jcas.tcas.Annotation> it = ajCAS.getAnnotationIndex(GeneName.type).iterator();
//    while(it.hasNext()){
//      //get sentence annotation from CAS
//      GeneName annotation = (GeneName) it.next();
//      String SentenceID = annotation.getGetID();
//      String SentenceText = annotation.getGetText();
////    System.out.println(SentenceText);
//      
//      //Stanford NLP processor
//      PosTagNamedEntityRecognizer p;
//      try {
//       p = new PosTagNamedEntityRecognizer();
//       Map<Integer,Integer> map = new HashMap<Integer,Integer>();
//       map = p.getGeneSpans(SentenceText);
//       Iterator<java.util.Map.Entry<Integer, Integer>> index=map.entrySet().iterator();   
//       while(index.hasNext()){
//         Map.Entry entry = (Map.Entry) index.next();
//         Object start = entry.getKey();
//         Object end = entry.getValue();
//         
//         //create gene annotation CAS
//        Gene gene = new Gene(ajCAS);
//         gene.setID(SentenceID);
//         gene.setStart((Integer)start);
//         gene.setEnd((Integer)end);
////         gene.setText(SentenceText.substring((Integer)start,(Integer)end));
//         gene.addToIndexes();
//       }
//      }catch (ResourceInitializationException e) {
//       // TODO Auto-generated catch block
//       e.printStackTrace();
//       }
//      }
//  }
//
//
//}

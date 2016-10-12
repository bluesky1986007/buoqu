package util;

import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;


public class Autoxml {
	public static Log log = LogFactory.getLog(Autoxml.class);

	/**
	 * 将XML转换为document
	 * 
	 * @param xmlFile
	 * @return document
	 */
	public static Document loadDocument(String xmlFile) {

		Document document = null;

		try {
			if (xmlFile != null) {

				File inputXml = new File(xmlFile);
				SAXReader saxReader = new SAXReader();
				document = saxReader.read(inputXml);

			}

			return document;
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			log.fatal("error when creating document througth xmlfile");
			e.printStackTrace();
		}

		return null;
	}

	/**
	 * 取得XML中节点中的数据
	 * 
	 * @param document
	 * @param path
	 * @return 节点中的value
	 */
	public static String getNodeValueByPath(Document document, String path) {

		String nodeValue = null;
		String nodePath = "";

		try {
			nodePath = getNodePath(path);
			nodeValue = ((Element) document.selectSingleNode(nodePath))
					.getText();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			log.fatal("单个节点取值时出错");
			log.fatal("节点路径：" + nodePath);
			e.printStackTrace();
		}

		return nodeValue;
	}

	/**
	 * 取到某个节点下的所有子节点的value集合
	 * 
	 * @param document
	 * @param path
	 * @param num
	 * @return HashMap
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static HashMap getNodeValuesByPath(Document document, String path,
			int num) {

		String nodeName = "";
		String nodePath = "";
		Element values = null;
		HashMap nodeValues = new HashMap();

		try {
			nodePath = getNodePath(path) + num + "/*";
			List nodes = document.selectNodes(nodePath);
			if (nodes.size() <= 0) {
				log.fatal("该节点下无任何子节点的值可取，请查看XML路径是否设置正确，谢谢！");
			}
			Iterator element = nodes.iterator();
			while (element.hasNext()) {
				values = (Element) element.next();
				nodeName = values.getName();
				nodeValues.put(nodeName, values.getText());
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			log.fatal("取节点下所有子节点values时出错");
			log.fatal("节点路径为：" + nodePath);
			log.fatal(nodeName + "  " + values.getText());
			e.printStackTrace();
		}

		return nodeValues;
	}

	/**
	 * 取得配置文件XML中节点中的数据
	 * 
	 * @param document
	 * @param path
	 * @return 节点中的value
	 */
	public static String getConfigValueByPath(Document document, String path) {

		String nodeValue = null;
		String nodePath = "";

		try {
			nodePath = "/"
					+ TestDriver.configRootName
					+ getNodePath(path);
			nodeValue = ((Element) document.selectSingleNode(nodePath))
					.getText();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			log.fatal("配置文件取值时出错");
			log.fatal("节点路径：" + nodePath);
			e.printStackTrace();
		}

		return nodeValue;
	}

	/**
	 * 得到以类名为根节点的XPATH格式的节点路径
	 * 
	 * @param strPath
	 * @return 节点路径
	 */
	public static String getNodePath(String strPath) throws Exception {
		String path = "";

		String nodePath[] = strPath.split(",");
		for (int i = 0; i < nodePath.length; i++) {
			String tmpPath = "/" + nodePath[i];
			path = path + tmpPath;
		}

		return path;
	}

}

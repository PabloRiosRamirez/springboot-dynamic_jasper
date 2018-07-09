/**
 * @author Pablo Ríos Ramírez
 * @Created 28-06-2018 2:43:46
 * @web http://www.pabloriosramirez.com
 *
 */


package com.pabloriosramirez.springboot.dynamicjasper.report;

import java.util.Map;
import net.sf.jasperreports.engine.JasperReport;

public interface ReportGenerator {
    JasperReport generateReport(Map params);
}

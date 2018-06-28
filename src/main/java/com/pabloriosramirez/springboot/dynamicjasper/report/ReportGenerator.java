
package com.pabloriosramirez.springboot.dynamicjasper.report;

import java.util.Map;
import net.sf.jasperreports.engine.JasperReport;

public interface ReportGenerator {
    JasperReport generateReport(Map params);
}

package perfeval;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.conf.Configured;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.PerformanceEvaluation;
import org.apache.hadoop.util.Tool;
import org.apache.hadoop.util.ToolRunner;


public class PerfEvalLauncher extends Configured implements Tool {
	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		int ret = ToolRunner.run(new PerfEvalLauncher(), args);
		System.exit(ret);
	}

	public int run(String[] arg0) throws Exception {
		Configuration c = HBaseConfiguration.create(getConf());

	    PerformanceEvaluation pe = new PerformanceEvaluation(c);
	    System.out.println("mapred.task.timeout=" + c.get("mapred.task.timeout"));
	    return pe.run(arg0);
	}
}

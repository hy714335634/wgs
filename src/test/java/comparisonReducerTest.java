import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mrunit.mapreduce.ReduceDriver;
import org.junit.Test;

import java.io.IOException;
import java.util.Arrays;

import static org.junit.Assert.*;

public class comparisonReducerTest {
    /*
        测试比对脚本
     */
    @Test
    public void merge() throws IOException {
        Text value = new Text("SRR1770413");
        new ReduceDriver<Text, Text, Text, Text>()
                .withReducer(new comparisonReducer())
                .withInputKey(new Text("1"))
                .withInputValues(Arrays.asList(value))
                .withOutput(new Text("1"), value)
                .runTest();


    }
}
package org.encog.examples.neural.forest;

import java.io.File;

public class Constant {
	public static final File BASE_DIRECTORY = new File("c:\\data");
	public static final File COVER_TYPE_FILE = new File(BASE_DIRECTORY,"covtype.data");
	public static final File TRAINING_FILE = new File(BASE_DIRECTORY,"training.csv");
	public static final File EVALUATE_FILE = new File(BASE_DIRECTORY,"evaluate.csv");
	public static final File BALANCE_FILE = new File(BASE_DIRECTORY,"balance.csv");
	public static final File NORMALIZED_FILE = new File(BASE_DIRECTORY, "normalized.csv");
	public static final File BINARY_FILE = new File(BASE_DIRECTORY, "normalized.bin");
	
	
	public static final File TRAINED_NETWORK_FILE = new File(BASE_DIRECTORY,"forest.eg");
	
	public static final String TRAINED_NETWORK_NAME = "forest-network";

	public static final int TRAINING_MINUTES = 10;
	public static final String NORMALIZATION_NAME = "forest-norm";
	public static final int HIDDEN_COUNT = 100;
}

package edu.unc.genomics.io;

import java.io.IOException;
import java.nio.file.Path;

import edu.unc.genomics.BedGraphEntry;
import edu.unc.genomics.IntervalFactory;

/**
 * @author timpalpant
 *
 */
public class BedGraphFile extends TextIntervalFile<BedGraphEntry> {

	protected BedGraphFile(Path p) throws IOException {
		super(p, new BedGraphEntryFactory());
	}

	private static class BedGraphEntryFactory implements IntervalFactory<BedGraphEntry> {

		@Override
		public BedGraphEntry parse(String line) {
			return BedGraphEntry.parse(line);
		}
		
	}
}
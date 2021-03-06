package org.osmsurround.ra.export;

import java.util.ArrayList;
import java.util.List;

import org.osmtools.api.Section;
import org.osmtools.ra.context.AnalyzerContext;
import org.osmtools.ra.data.Node;
import org.osmtools.ra.dijkstra.Edge;
import org.osmtools.ra.export.SectionContainer;
import org.osmtools.ra.graph.Graph;
import org.osmtools.ra.segment.ConnectableSegment;
import org.osmtools.ra.traverse.TraverseService;

public class SimpleSegmentConverter {

	public List<Section> convert(AnalyzerContext analyzerContext) {

		List<Section> containers = new ArrayList<Section>();

		List<Graph> graphs = analyzerContext.getGraphs();
		List<ConnectableSegment> modifyableSegments = new ArrayList<ConnectableSegment>(analyzerContext.getSegments());

		for (int graphIndex = 0; graphIndex < graphs.size(); graphIndex++) {

			Graph graph = graphs.get(graphIndex);

			SectionContainer sectionContainer = new SectionContainer("Graph " + (graphIndex + 1));

			for (Edge edge : graph.getEdges()) {
				Node startNode = edge.getSource().getNode();
				Node currentNode = edge.getDestination().getNode();

				List<Node> nodes = new ArrayList<Node>();
				nodes.add(startNode);
				TraverseService.fillInNodesBetweenNodes(modifyableSegments, nodes, startNode, currentNode);
				sectionContainer.addCoordinates(nodes);
			}
			containers.add(sectionContainer);
		}

		return containers;
	}

}

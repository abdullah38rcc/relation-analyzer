/**
 * This file is part of Relation Analyzer for OSM.
 * Copyright (c) 2001 by Adrian Stabiszewski, as@grundid.de
 *
 * Relation Analyzer is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Relation Analyzer is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with Relation Analyzer.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.osmsurround.ra.report;

import java.util.List;

import org.osmsurround.ra.stats.RelationStatistics;

public class Report {

	private boolean validRelation;
	private boolean gone;
	private RelationRating relationRating;
	private RelationInfo relationInfo;
	private List<ReportItem> reportItems;
	private RelationStatistics relationStatistics;
	private String elevationProfileJson;

	public Report() {
	}

	public Report(boolean gone) {
		this.gone = gone;
	}

	public String getElevationProfileJson() {
		return elevationProfileJson;
	}

	public void setElevationProfileJson(String elevationProfileJson) {
		this.elevationProfileJson = elevationProfileJson;
	}

	public RelationRating getRelationRating() {
		return relationRating;
	}

	public void setRelationRating(RelationRating relationRating) {
		this.relationRating = relationRating;
	}

	public RelationInfo getRelationInfo() {
		return relationInfo;
	}

	public void setRelationInfo(RelationInfo relationInfo) {
		this.relationInfo = relationInfo;
	}

	public List<ReportItem> getReportItems() {
		return reportItems;
	}

	public void setReportItems(List<ReportItem> reportItems) {
		this.reportItems = reportItems;
	}

	public RelationStatistics getRelationStatistics() {
		return relationStatistics;
	}

	public void setRelationStatistics(RelationStatistics relationStatistics) {
		this.relationStatistics = relationStatistics;
	}

	public boolean isValidRelation() {
		return validRelation;
	}

	public void setValidRelation(boolean validRelation) {
		this.validRelation = validRelation;
	}

	public boolean isGone() {
		return gone;
	}
}

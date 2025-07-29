package com.recommendation;

import org.apache.mahout.cf.taste.common.TasteException;
import org.apache.mahout.cf.taste.impl.model.file.FileDataModel;
import org.apache.mahout.cf.taste.impl.neighborhood.NearestNUserNeighborhood;
import org.apache.mahout.cf.taste.impl.recommender.GenericUserBasedRecommender;
import org.apache.mahout.cf.taste.impl.similarity.PearsonCorrelationSimilarity;
import org.apache.mahout.cf.taste.model.DataModel;
import org.apache.mahout.cf.taste.neighborhood.UserNeighborhood;
import org.apache.mahout.cf.taste.recommender.RecommendedItem;
import org.apache.mahout.cf.taste.similarity.UserSimilarity;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class RecommenderEngine {
    public static void main(String[] args) {
        try {
            // Load dataset
            DataModel model = new FileDataModel(new File("dataset.csv"));

            // Define similarity metric
            UserSimilarity similarity = new PearsonCorrelationSimilarity(model);

            // Define user neighborhood
            UserNeighborhood neighborhood = new NearestNUserNeighborhood(2, similarity, model);

            // Create recommender
            GenericUserBasedRecommender recommender = new GenericUserBasedRecommender(model, neighborhood, similarity);

            // Recommend for user with ID 1
            List<RecommendedItem> recommendations = recommender.recommend(1, 3);

            // Output recommendations
            for (RecommendedItem item : recommendations) {
                System.out.println("Recommended Item ID: " + item.getItemID() + " | Value: " + item.getValue());
            }

        } catch (IOException | TasteException e) {
            e.printStackTrace();
        }
    }
}
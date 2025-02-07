import joblib  # You can also use pickle if you prefer

# Define the paths to the model files
bagging_model_path = r'D:\Skin-disease-detection\models\bagging_model.pkl'
adaboost_model_path = r'D:\Skin-disease-detection\models\adaboost_model.pkl'
hist_gradient_boosting_model_path = r'D:\Skin-disease-detection\models\hist_gradient_boosting_model.pkl'
extra_trees_model_path = r'D:\Skin-disease-detection\models\extra_trees_model.pkl'

# Load the models
bagging_model = joblib.load(bagging_model_path)
adaboost_model = joblib.load(adaboost_model_path)
hist_gradient_boosting_model = joblib.load(hist_gradient_boosting_model_path)
extra_trees_model = joblib.load(extra_trees_model_path)

# Check the models
print(bagging_model)
print(adaboost_model)
print(hist_gradient_boosting_model)
print(extra_trees_model)

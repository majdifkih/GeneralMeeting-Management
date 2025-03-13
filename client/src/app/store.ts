import { configureStore } from "@reduxjs/toolkit";
import exempleReducer from "../slices/exempleSlice";  

const store = configureStore({
  reducer: {
    exemple: exempleReducer,
  },
});

export default store;
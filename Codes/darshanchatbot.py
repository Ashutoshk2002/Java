import random

dataset = {
    "hi": ["Hey", "Hey Buddy", "Hello"],
    "what am i doing right now?": ["You are just chit-chatting with me."],
    "do you know me?": ["I only know my creator Darshan Desale", "Sorry But I can't"],
    "how are you?": ["Oh, I'm doing wonderfully well!", "Glad you asked! I'm feeling amazing!", "Doing Great, Thank you for asking"],
    "what is your name?": ["ChatBot 3.0", "My Self ChatBot 3.0", "My Name is ChatBot 3.0"],
    "can you answer all my questions?": ["I will try at my level Best", "I am a simple chatbot, So You can't expect a lot from me", "I am chatbot 3.0, my next versions will definitely answer you all your Questions", "Your bot doesn’t need to have an answer to every question"],
    "what is your age?": ["My age is not defined", "My age is not Calculated yet", "Sorry I can't tell my age :("],
    "exit": ["Thank you, Goodbye", "Visit Again !!!!", "Hope our site helpful for you !!!!!", "Thank U For Using Our ChatBot !!!!!"]
}

print("\nWelcome to ChatBot 0.3 !!!!!!\n")
print("Enter your question OR Enter 'exit' to Stop\n")

while True:
    input_str = input("\nYou : ")
    
    input_str = input_str.lower()

    if input_str == "exit":
        break

    for question, answers in dataset.items():
        if input_str in question:
            random_answer = random.choice(answers)
            print("Bot : " + random_answer)
            break
